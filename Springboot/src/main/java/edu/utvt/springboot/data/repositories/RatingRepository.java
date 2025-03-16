package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}