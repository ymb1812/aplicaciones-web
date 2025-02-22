package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlumnoRepository extends JpaRepository<Alumno, UUID> {
}
