package com.macrosoft.apifirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.macrosoft.apifirst.model.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}

