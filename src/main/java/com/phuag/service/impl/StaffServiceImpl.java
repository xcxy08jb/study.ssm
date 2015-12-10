package com.phuag.service.impl;

import com.phuag.dao.StaffMapper;
import com.phuag.model.Staff;
import com.phuag.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/11/17 0017.
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    public int insertStaff(Staff staff) {
        return staffMapper.insert(staff);
    }

    public Staff getStaffById(int staffId) {
        return staffMapper.selectByPrimaryKey(staffId);
    }
}
