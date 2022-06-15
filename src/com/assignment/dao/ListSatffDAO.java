package com.assignment.dao;
import com.assignment.model.Staff;

public interface ListSatffDAO {
    void updateStaff(Staff newStaff, int index);
    void insertStaff(Staff staff);
    void insertStaffAtIndex(Staff staff, int index);
    void deleteStaff(int index);
    Staff getStaff(int index);
}
