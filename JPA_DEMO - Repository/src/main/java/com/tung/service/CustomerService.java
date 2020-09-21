package com.tung.service;

import com.tung.model.Customer;
import com.tung.model.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Iterable<Customer> findAllByAddress(String address);

    Iterable<Customer> findAllByProvince(Province province);

    Customer findFirstById(Long id);

    void save(Customer customer);

    public void delete(Customer customer);


}