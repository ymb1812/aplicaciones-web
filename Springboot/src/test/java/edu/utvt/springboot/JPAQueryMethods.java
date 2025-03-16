package edu.utvt.springboot;


import edu.utvt.springboot.data.entities.Player;
import edu.utvt.springboot.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springdoc.core.converters.models.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class JPAQueryMethods {
    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void findByFullName(){
        String fullName = "Shai Gilgeous-Alexander";
        playerRepository.findByFullName(fullName).forEach(System.out::println);

    }

    @Test
    void findByFullNameContaining(){
        String name = "Shai";
        this.playerRepository.findByFullNameContaining(name).forEach(System.out::println);
    }

    @Test
    void findByTeamAndAge(){
        String team = "Okc";
        Integer age = 27;
        this.playerRepository.findByTeamAndAge(team, age).forEach(System.out::println);
    }

    @Test
    void findByTeamAndPageable(){
        PageRequest pageable = PageRequest.of(0, 5);
        Page<Player> page = this.playerRepository.findByTeam("Cha", pageable);
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
