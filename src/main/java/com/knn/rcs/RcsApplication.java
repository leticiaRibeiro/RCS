package com.knn.rcs;

import com.knn.rcs.model.Student;
import com.knn.rcs.model.Teacher;
import com.knn.rcs.repository.StudentRepository;
import com.knn.rcs.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RcsApplication/* implements CommandLineRunner */{

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	TeacherRepository teacherRepository;
	public static void main(String[] args) {
		SpringApplication.run(RcsApplication.class, args);
	}


/*	@Override
	public void run(String... args) throws Exception {
		Student estudante = studentRepository.save(new Student("Gustavo Bezerrra"));
		Teacher professor = teacherRepository.save(new Teacher("Luciana"));
	}*/
}
