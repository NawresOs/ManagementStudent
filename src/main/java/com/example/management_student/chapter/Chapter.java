package com.example.management_student.chapter;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.example.management_student.subject.Subject;

@Entity
@Getter
@Setter
public class Chapter {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "sub_id")
    private Subject subject;
}
