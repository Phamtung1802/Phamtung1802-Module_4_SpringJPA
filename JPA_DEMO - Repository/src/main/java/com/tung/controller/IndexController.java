package com.tung.controller;

import com.tung.model.Customer;
import com.tung.model.Province;
import com.tung.repository.CustomerRepository;
import com.tung.service.CustomerService;
import com.tung.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private CustomerService customerServiceImpl;

    @Autowired
    private ProvinceService ProvinceServiceImpl;

    @GetMapping("/")
    public ModelAndView showIndex(){
        Iterable<Customer> list=customerServiceImpl.findAll();
        Iterable<Province> provinces=ProvinceServiceImpl.findAll();
        ModelAndView modelAndView=new ModelAndView("/customer/list");
        modelAndView.addObject("customers",list);
        modelAndView.addObject("provinces",provinces);
        return modelAndView ;
    }
}
