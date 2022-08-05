package com.jotaerre.clientCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jotaerre.clientCrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
