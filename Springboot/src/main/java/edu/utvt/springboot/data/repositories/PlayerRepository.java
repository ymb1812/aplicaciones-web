package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
