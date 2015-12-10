package com.phuag.controller;

import com.alibaba.fastjson.JSONObject;
import com.phuag.model.Staff;
import com.phuag.service.StaffService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/11/17 0017.
 */
public class StaffController {
    @Resource
    private StaffService staffService;

    @RequestMapping("/staff/{staffId}")
    public String staff(@PathVariable("staffId") String staffId) {
        System.out.print(staffId);
        Staff staff = staffService.getStaffById(Integer.parseInt(staffId));
        JSONObject jsonStaff = (JSONObject) JSONObject.toJSON(staff);
        return jsonStaff.toString();
    }


}
