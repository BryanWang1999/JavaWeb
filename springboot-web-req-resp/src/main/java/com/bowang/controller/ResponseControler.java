package com.bowang.controller;

import com.bowang.pojo.Address;
import com.bowang.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseControler {

//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("Hello World");
//        return "Hello World";
//    }
//
//    @RequestMapping("/getAddress")
//    public Address getAddr() {
//        Address address = new Address();
//        address.setProvince("Guangdong");
//        address.setCity("Shenzhen");
//        return address;
//    }
//
//    @RequestMapping("/getAddressList")
//    public List<Address> getAddrList() {
//        List<Address> list = new ArrayList<>();
//        Address address1 = new Address();
//        address1.setProvince("Guangdong");
//        address1.setCity("Shenzhen");
//        Address address2 = new Address();
//        address2.setProvince("Liaoning");
//        address2.setCity("Shenyang");
//
//        list.add(address1);
//        list.add(address2);
//
//        return list;
//    }

    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello World");
        return Result.success("Hello World");
    }

    @RequestMapping("/getAddress")
    public Result getAddr() {
        Address address = new Address();
        address.setProvince("Guangdong");
        address.setCity("Shenzhen");
        return Result.success(address);
    }

    @RequestMapping("/getAddressList")
    public Result getAddrList() {
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("Guangdong");
        address1.setCity("Shenzhen");
        Address address2 = new Address();
        address2.setProvince("Liaoning");
        address2.setCity("Shenyang");

        list.add(address1);
        list.add(address2);

        return Result.success(list );
    }
}
