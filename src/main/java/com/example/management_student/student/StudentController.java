package com.example.management_student.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")


public class StudentController {

    // POST https://some.url.com/students
    // GET https://some.url.com/students
    // Filter GET https://some.url.com/students/{id}
    // Filter GET https://some.url.com/students?param1=val1&param2=val2 // query params
    // PUT https://some.url.com/students
    // DELETE https://some.url.com/students/{id}

    // Embedded resources
    // GET https://some.url.com/students/subject/{s-id}
    // GET https://some.url.com/students/{s-id}/subject/{sb-id}
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }





    /*@GetMapping("/{student-id}")
    public Student findById(
            @PathVariable("student-id") Integer studentId
    ) {
        return service.findById(studentId);
    }*/


    @PostMapping
    public void save( @RequestBody  Student student){
        service.save(student);
    }

    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }

}