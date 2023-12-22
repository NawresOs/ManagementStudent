package com.example.management_student.address;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.example.management_student.student.Student;

@Entity
@Getter
@Setter


public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String homeAddress;

    @OneToOne
    @JoinColumn(name = "std_id")
    @JsonManagedReference
    private Student student;
}