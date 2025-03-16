package edu.utvt.springboot.data.entities;

import edu.utvt.springboot.data.common.PublishingCompanies;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "tc_books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Enumerated(EnumType.STRING)
    private PublishingCompanies publisher;

    @Min(value = 1000, message = "The smallest value is 1000")
    private Integer year;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Rating> ratings;

    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)
    private List<Author> authors;
}
