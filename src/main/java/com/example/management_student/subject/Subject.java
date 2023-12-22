package com.example.management_student.subject;

import com.example.management_student.chapter.Chapter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.management_student.student.Student;

import java.util.List;

@Entity
@Getter
@Setter
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

   /* @ManyToMany(mappedBy = "subjects")
    @JsonBackReference
    private List<Student> students;*/

    @OneToMany(mappedBy = "subject")
    private List<Chapter> chapters;
}
