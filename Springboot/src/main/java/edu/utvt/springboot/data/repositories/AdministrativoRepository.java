package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdministrativoRepository extends JpaRepository<Administrativo, UUID> {
}
