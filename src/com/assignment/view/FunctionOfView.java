package com.assignment.view;

import com.assignment.model.Staff;
import com.assignment.model.StaffList;
import static com.assignment.view.View.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FunctionOfView {

    static public boolean CheckForm(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary) {
//        Check ID
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ID không được để trống");
            txtId.grabFocus();
            return false;
        } else if (!isUpdate) {
            for (int i = 0; i < listStaff.getSize(); i++) {
                if (txtId.getText().equals(listStaff.getStaff(i).getId())) {
                    JOptionPane.showMessageDialog(null, "ID không được trùng với nhân viên trong danh sách có trước");
                    txtId.grabFocus();
                    return false;
                }
            }
        }

//      Check Name
        if (txtFullname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tên không được để trống");
            txtFullname.grabFocus();
            return false;
        }

//        Check Age
        try {
            int age = Integer.parseInt(txtAge.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Tuổi phải là 1 số");
            txtAge.grabFocus();
            return false;
        }

        if (!(Double.parseDouble(txtAge.getText()) == Integer.parseInt(txtAge.getText()))) {
            JOptionPane.showMessageDialog(null, "Tuổi phải là số nguyên");
            txtAge.grabFocus();
            return false;
        } else if (!(Integer.parseInt(txtAge.getText()) > 15 && Integer.parseInt(txtAge.getText()) < 56)) {
            JOptionPane.showMessageDialog(null, "Tuổi phải từ 16 đến 55");
            txtAge.grabFocus();
            return false;
        }

        //     Check email
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống email");
            txtEmail.grabFocus();
            return false;
        }

        String emailPattern = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}+";
        if (!(txtEmail.getText()).matches(emailPattern) && !(txtEmail.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập email đúng định dạng");
            txtEmail.grabFocus();
            return false;
        }
//check Salary
        try {
            Double salary = Double.parseDouble(txtSalary.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Lương phải là 1 số");
            txtSalary.grabFocus();
            return false;
        }

//        Check Salary
        if (txtSalary.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lương không được để trống");
            txtSalary.grabFocus();
            return false;
        } else if ((Double.parseDouble(txtSalary.getText())) <= 5000000) {
            JOptionPane.showMessageDialog(null, "Lương phải trên 5 triệu");
            txtSalary.grabFocus();
            return false;
        }
        return true;
    }

    static public String getHours() {
        Date now = new Date();
        SimpleDateFormat formter = new SimpleDateFormat();
        formter.applyPattern("hh:mm:ss aa");
        return formter.format(now);
    }

    static public void updateClock(JLabel lblClock) {
        Runnable update = () -> {
            while (true) {
                lblClock.setText(getHours());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Thread t1 = new Thread(update);
        t1.start();
    }

    static public void ClearForm(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary, JLabel lblAvt) {
        txtAge.setText("");
        txtEmail.setText("");
        txtFullname.setText("");
        txtSalary.setText("");
        txtId.setText("");
        lblAvt.setIcon(new ImageIcon("src\\com\\assignment\\avt\\avtnorNew1.png"));
        txtId.grabFocus();
    }

    static public void UpdateLblRecord(JLabel lblRecord, StaffList listStaff) {
        lblRecord.setText("Record: " + (indexStaffSeleted + 1) + " of " + listStaff.getSize());
    }

    static public Staff ReadForm(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary) {
        if (imageAvtPath.isEmpty()) {
            imageAvtPath = "src\\com\\assignment\\avt\\avtnorNew1.png";
        }
        Staff staff = new Staff(txtId.getText(), txtFullname.getText(), Integer.parseInt(txtAge.getText()), txtEmail.getText(), Double.parseDouble(txtSalary.getText()), imageAvtPath);
        return staff;
    }

    static public void WriteStaff(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary, JLabel lblAvt, JLabel lblRecord, StaffList listStaff, JTable tblStaff) {
        if (indexStaffSeleted > -1) {
            txtId.setText(listStaff.getStaff(indexStaffSeleted).getId());
            txtFullname.setText(listStaff.getStaff(indexStaffSeleted).getFullName());
            txtAge.setText(listStaff.getStaff(indexStaffSeleted).getAge() + "");
            txtEmail.setText(listStaff.getStaff(indexStaffSeleted).getEmail());
            txtSalary.setText(String.format("%.1f", listStaff.getStaff(indexStaffSeleted).getSalary()));
            lblAvt.setIcon(new ImageIcon(listStaff.getStaff(indexStaffSeleted).getPathImg()));
            txtId.grabFocus();
            FunctionOfView.UpdateLblRecord(lblRecord, listStaff);
            tblStaff.setRowSelectionInterval(indexStaffSeleted, indexStaffSeleted);
        }
    }

    static public void FillForm(DefaultTableModel tblStaffModel) {
        tblStaffModel.setRowCount(0);
        for (int i = 0; i < listStaff.getSize(); i++) {
            Object[] staffData = {listStaff.getStaff(i).getId(), listStaff.getStaff(i).getFullName(), listStaff.getStaff(i).getAge(), listStaff.getStaff(i).getEmail(), String.format("%,.1f", listStaff.getStaff(i).getSalary())};
            tblStaffModel.addRow(staffData);
        }
        listStaff.autoSort();
    }

    static public void AddStaff(DefaultTableModel tblStaffModel, JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary, JLabel lblAvt) {
        if (FunctionOfView.CheckForm(txtId, txtFullname, txtAge, txtEmail, txtSalary)) {
            System.out.println("Vào add");
            Staff staff = ReadForm(txtId, txtFullname, txtAge, txtEmail, txtSalary);
            listStaff.insertStaff(staff);
            tblStaffModel.addRow(new Object[]{staff.getId(), staff.getFullName(), staff.getAge(), staff.getEmail(), String.format("%,.1f", staff.getSalary())});
            indexStaffSeleted = listStaff.getSize().intValue() - 1;
            System.out.println("curren index add: " + indexStaffSeleted);
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
            System.out.println(isUpdate);
            listStaff.autoSort();
            if (!isUpdate) {
                FunctionOfView.ClearForm(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblAvt);
                txtId.grabFocus();
            }
        }
    }

    static public void UpdateStaff(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary, JLabel lblAvt) {
        if (FunctionOfView.CheckForm(txtId, txtFullname, txtAge, txtEmail, txtSalary) && isUpdate) {
            if (imageAvtPath.isEmpty()) {
                imageAvtPath = "src\\com\\assignment\\avt\\avtnorNew1.png";
            }
            Staff staff = new Staff(txtId.getText(), txtFullname.getText(), Integer.parseInt(txtAge.getText()), txtEmail.getText(), Double.parseDouble(txtSalary.getText()), imageAvtPath);
            listStaff.updateStaff(staff, indexStaffSeleted);
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
            listStaff.autoSort();
        }
    }

    static public void FindStaff(JTextField txtId, JTextField txtFullname, JTextField txtAge, JTextField txtEmail, JTextField txtSalary, JLabel lblAvt, JLabel lblRecord, StaffList listStaff, JTable tblStaff) {
        int done = 0, indexOfStaff = -1;
        String idStaff = JOptionPane.showInputDialog(null, "Nhập vào mã nhân viên cần tìm kiếm", "Tìm kiếm", JOptionPane.QUESTION_MESSAGE);
        for (int i = 0; i < listStaff.getSize(); i++) {
            if (idStaff.equalsIgnoreCase(listStaff.getStaff(i).getId())) {
                indexOfStaff = i;
                done = 1;
                break;
            }
        }
        if (done == 1) {
            indexStaffSeleted = indexOfStaff;
            WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblAvt, lblRecord, listStaff, tblStaff);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên này");
        }
    }

    static public void DeleteStaff() {
        isUpdate = false;
        if (indexStaffSeleted == -1) {
            if (listStaff.getSize() == 0) {
                JOptionPane.showMessageDialog(null, "Danh sách nhân viên đang rỗng");
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn hàng cần xóa");
            }
        } else if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa nhân viên này không") == 0) {
            listStaff.deleteStaff(indexStaffSeleted);
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công");
            listStaff.autoSort();
            indexStaffSeleted = -1;
        }
    }
}
