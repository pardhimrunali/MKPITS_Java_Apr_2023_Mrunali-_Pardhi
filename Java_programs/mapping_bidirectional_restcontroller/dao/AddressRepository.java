package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
