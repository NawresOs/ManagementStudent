package com.example.management_student.address;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AddressService {

    void save (Address address);
    Object findById(Integer id);
    List<Address> findAll();
    void deleteById (Integer id);
}
