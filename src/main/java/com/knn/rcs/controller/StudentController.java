package com.knn.rcs.controller;

import com.knn.rcs.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StudentController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public Student hello(@RequestParam(value = "name", defaultValue = "World")String name) {
        return new Student(counter.incrementAndGet(),
                String.format(template, name));

    }
}
