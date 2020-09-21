package com.tung.service;

import com.tung.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);

}
