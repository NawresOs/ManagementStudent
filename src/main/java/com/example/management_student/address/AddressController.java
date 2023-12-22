package com.example.management_student.address;
import com.example.management_student.student.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
        super();
        this.service = service;
    }


    @PostMapping
    public void save(@RequestBody Address address){
        service.save(address);
    }

    @GetMapping
    public List<Address> findAll() {
        return service.findAll();
    }

}
