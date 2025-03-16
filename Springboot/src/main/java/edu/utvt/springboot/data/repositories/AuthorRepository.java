package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}