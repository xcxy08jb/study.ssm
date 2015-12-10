package com.phuag.service;

import com.phuag.model.Staff;

/**
 * Created by Administrator on 2015/11/17 0017.
 */
public interface StaffService {

    public int insertStaff(Staff staff);

    public Staff getStaffById(int staffId);
}
