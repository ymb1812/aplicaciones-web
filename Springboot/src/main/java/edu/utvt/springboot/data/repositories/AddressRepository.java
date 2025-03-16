package edu.utvt.springboot.data.repositories;

import edu.utvt.springboot.data.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}