package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}