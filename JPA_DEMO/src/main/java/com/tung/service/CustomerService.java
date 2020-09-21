package com.tung.service;

import com.tung.model.Customer;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    List<Customer> findAllByAddress(String address);

    void save(Customer customer);

    public void delete(Customer customer);


}