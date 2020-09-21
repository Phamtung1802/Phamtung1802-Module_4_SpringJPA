package com.tung.repository;

import com.tung.model.Customer;
import com.tung.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}