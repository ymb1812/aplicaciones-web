package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Address;
import edu.utvt.springboot.data.entities.Author;
import edu.utvt.springboot.data.repositories.AddressRepository;
import edu.utvt.springboot.data.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class OneToOneTest {

        @Autowired
        private AuthorRepository authorRepository;

        @Autowired
        private AddressRepository addressRepository;

        @Test
        void addAuthorWithAddress() {
            Address address = new Address();
            address.setStreet("Fuerte de Guadalupe");
            address.setCity("Mexico");

            Author author = new Author();
            author.setFullName("Yerely");

            author.setAddress(address);
            address.setAuthor(author);

            Author savedAuthor = authorRepository.save(author);

            assertNotNull(savedAuthor.getId());
            assertNotNull(savedAuthor.getAddress().getId());
            assertEquals("Yerely", savedAuthor.getFullName());
            assertEquals("Fuerte de Guadalupe", savedAuthor.getAddress().getStreet());
            assertEquals("Mexico", savedAuthor.getAddress().getCity());

            Address savedAddress = addressRepository.findById(savedAuthor.getAddress().getId()).orElse(null);
            assertNotNull(savedAddress);
            assertNotNull(savedAddress.getAuthor());
            assertEquals(savedAuthor.getId(), savedAddress.getAuthor().getId());
        }

        @Test
        void deleteAuthorWithAddress() {
            Address address = new Address();
            address.setStreet("456 Elm St");
            address.setCity("Metropolis");

            Author author = new Author();
            author.setFullName("Jane Doe");
            author.setAddress(address);
            address.setAuthor(author);

            Author savedAuthor = authorRepository.save(author);

            assertNotNull(savedAuthor.getId());
            assertNotNull(savedAuthor.getAddress().getId());

            authorRepository.delete(savedAuthor);

            assertFalse(authorRepository.existsById(savedAuthor.getId()));
            assertFalse(addressRepository.existsById(savedAuthor.getAddress().getId()));
        }

        @Test
        void updateAuthorAddress() {
            Address address = new Address();
            address.setStreet("789 Oak St");
            address.setCity("Gotham");

            Author author = new Author();
            author.setFullName("Bruce Wayne");
            author.setAddress(address);
            address.setAuthor(author);

            Author savedAuthor = authorRepository.save(author);

            assertNotNull(savedAuthor.getId());
            assertNotNull(savedAuthor.getAddress().getId());

            Address updatedAddress = savedAuthor.getAddress();
            updatedAddress.setStreet("1007 Mountain Drive");
            updatedAddress.setCity("Batcave");

            authorRepository.save(savedAuthor);

            Author updatedAuthor = authorRepository.findById(savedAuthor.getId()).orElse(null);
            assertNotNull(updatedAuthor);

            assertEquals("1007 Mountain Drive", updatedAuthor.getAddress().getStreet());
            assertEquals("Batcave", updatedAuthor.getAddress().getCity());

            assertEquals(updatedAuthor.getId(), updatedAuthor.getAddress().getAuthor().getId());
        }
    }

