package com.tung.repository;

import com.tung.model.Customer;
import com.tung.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByAddress(String address);
    Iterable<Customer> findAllByProvince(Province province);
    Customer findFirstById(Long id);

}