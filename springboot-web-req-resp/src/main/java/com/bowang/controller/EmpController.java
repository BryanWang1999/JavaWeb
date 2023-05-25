package com.bowang.controller;

import com.bowang.pojo.Emp;
import com.bowang.pojo.Result;
import com.bowang.service.EmpService;
import com.bowang.service.impl.EmpServiceA;
import com.bowang.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
public class EmpController {

    @Qualifier("empServiceA")
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();
        // 响应数据
        return Result.success(empList);
    }

//    @RequestMapping("/listEmp")
//    public Result list() {
//        // 加载并解析emp.xml
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        // 对数据进行转换处理
//        empList.stream().forEach((emp -> {
//            // 处理gender 1： 男 2：女
//            String gender = emp.getGender();
//            if ("1".equals(gender)) {
//                emp.setGender("男");
//            } else if ("2".equals(gender)) {
//                emp.setGender("女");
//            }
//
//            // 处理job
//            String job = emp.getJob();
//            if ("1".equals(job)) {
//                emp.setJob("讲师");
//            } else if ("2".equals(job)) {
//                emp.setJob("班主任");
//            } else if ("3".equals(job)) {
//                emp.setJob("就业指导");
//            }
//        }));
//
//        // 响应数据
//        return Result.success(empList);
//    }
}
