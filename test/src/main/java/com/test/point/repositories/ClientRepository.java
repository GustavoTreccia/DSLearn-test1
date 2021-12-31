package com.test.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.point.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	Client getById(Long id);

}
