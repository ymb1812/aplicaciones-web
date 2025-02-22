package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
