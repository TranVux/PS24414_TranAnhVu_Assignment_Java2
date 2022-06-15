package com.assignment.model;

import com.assignment.dao.ListSatffDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StaffList implements ListSatffDAO, Serializable {

    private ArrayList<Staff> listStaff;

    public StaffList(ArrayList<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    public StaffList() {
        this.listStaff = new ArrayList<>();
    }

    @Override
    public void insertStaff(Staff staff) {
        listStaff.add(staff);
    }

    @Override
    public void insertStaffAtIndex(Staff staff, int index) {
        listStaff.add(index, staff);
    }

    @Override
    public void deleteStaff(int index) {
        listStaff.remove(index);
    }

    @Override
    public Staff getStaff(int index) {
        return listStaff.get(index);
    }

    @Override
    public void updateStaff(Staff newStaff, int index) {
        listStaff.set(index, newStaff);
    }

    public Integer getSize() {
        return listStaff.size();
    }
    
    public boolean isEmpty(){
        return this.listStaff.isEmpty();
    }
    
    public ArrayList<Staff> getList(){
        return this.listStaff;
    }
    
    public void RemoveAll(){
        listStaff.clear();
    }
    
    public void autoSort(){
        Comparator<Staff> comparator = new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        Collections.addAll(listStaff);
        Collections.sort(listStaff, comparator);
    }
}
