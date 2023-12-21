package com.example.demoRestAPI.service;

import com.example.demoRestAPI.entity.Address;
import com.example.demoRestAPI.entity.Student;

public interface AddressService {
    Address findByAddress(Integer id);

    void delete(Integer id);

}
