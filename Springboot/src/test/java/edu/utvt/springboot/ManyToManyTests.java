package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Address;
import edu.utvt.springboot.data.entities.Author;
import edu.utvt.springboot.data.entities.Book;
import edu.utvt.springboot.data.repositories.AuthorRepository;
import edu.utvt.springboot.data.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class ManyToManyTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void add(){
        Author author = new Author(null, "J. R. R. Talkin", new ArrayList<Book>());
        Book book = this.bookRepository.findAll().getFirst();

        if (book != null) {
            author.getBooks().add(book);
            this.authorRepository.save(author);
        }
    }

    @Test
    void delete(){

        if (this.bookRepository.count() > 0) {

            Author author = this.authorRepository.findAll().getFirst();


            this.authorRepository.delete(author);
        }
    }
}

