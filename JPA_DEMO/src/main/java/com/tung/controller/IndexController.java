package com.tung.controller;

import com.tung.model.Customer;
import com.tung.repository.CustomerRepository;
import com.tung.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private CustomerService customerServiceImpl;

    @GetMapping("/")
    public ModelAndView showIndex(){
        Iterable<Customer> list=customerServiceImpl.findAll();
        ModelAndView modelAndView=new ModelAndView("/customer/list");
        modelAndView.addObject("customers",list);
        return modelAndView ;
    }
}
