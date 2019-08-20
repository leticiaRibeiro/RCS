package com.knn.rcs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Replacement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
//    private LocalDateTime start;
//    private LocalDateTime end;
//    @ManyToOne
//    private Teacher teacher;
//    @ManyToOne
//    private Student student;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getStart() {
//        return start;
//    }
//
//    public void setStart(LocalDateTime start) {
//        this.start = start;
//    }
//
//    public LocalDateTime getEnd() {
//        return end;
//    }
//
//    public void setEnd(LocalDateTime end) {
//        this.end = end;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
