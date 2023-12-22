package com.example.management_student.address.impl;

import com.example.management_student.address.Address;
import com.example.management_student.address.AddressRepository;
import com.example.management_student.address.AddressService;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void save(Address address) {
        this.addressRepository.save(address);
    }

    @Override
    public Object findById(Integer id) {
        return this.addressRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Address> findAll() {
        return this.addressRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        this.addressRepository.deleteById(id);
    }
}
