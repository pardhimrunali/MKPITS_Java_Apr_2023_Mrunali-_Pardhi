package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.AddressRepository;
import com.example.demoRestAPI.entity.Address;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImplementation implements AddressService{
    private AddressRepository addressRepository;
    @Autowired

    public AddressServiceImplementation(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findByAddress(Integer id) {
        return addressRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        addressRepository.deleteById(id);

    }


}
