package edu.utvt.springboot;


import edu.utvt.springboot.data.entities.Player;
import edu.utvt.springboot.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrudTests {
    Logger LOGGER = LoggerFactory.getLogger(CrudTests.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void addPlayer() {
        Player player = new Player(null, 1000, "El chicharito", "La Chivas", "C", 100, 5.0);
        this.playerRepository.save(player);
        Assertions.assertNotNull(player.getId(), () -> "The player id is null");
        System.out.println(player);
    }

    @Test
    void updatePlayer() {

        Player player = null;
        Integer currentAge = 0;

        player = this.playerRepository.findAll().getFirst();
        Assertions.assertNotNull(player, "The player must not be null");

        currentAge = player.getAge();
        player.setAge(currentAge + 1);
        this.playerRepository.save(player);

        this.LOGGER.info("Player has been update: " + player);
        Assertions.assertTrue(player.getAge() > currentAge, "The player age is less than the current age");
    }

    @Test
    void deletePlayer() {
        Player player = null;

        player = this.playerRepository.findAll().getLast();
        this.playerRepository.delete(player);

        player = this.playerRepository.findById(player.getId()).orElse(null);
        Assertions.assertNull(player, () -> "The player is not null");
        this.LOGGER.info("Player has been deleted: " + player);


    }

}
