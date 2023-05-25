package com.bowang.service.impl;

import com.bowang.dao.EmpDao;
import com.bowang.dao.impl.EmpDaoA;
import com.bowang.pojo.Emp;
import com.bowang.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
//@Component
@Service
public class EmpServiceB implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();

        empList.stream().forEach((emp -> {
            // 处理gender 1： 男 2：女
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("Man");
            } else if ("2".equals(gender)) {
                emp.setGender("Woman");
            }

            // 处理job
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        }));

        return empList;
    }
}
