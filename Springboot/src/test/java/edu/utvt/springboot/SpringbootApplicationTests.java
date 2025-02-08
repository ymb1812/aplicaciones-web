package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Student;
import edu.utvt.springboot.data.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {

		Student student = new Student("Pedro", "Picapiedra");
		studentRepository.save(student);
	}

}
