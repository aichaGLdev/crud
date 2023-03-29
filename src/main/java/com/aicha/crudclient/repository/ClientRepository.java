package com.aicha.crudclient.repository;

import com.aicha.crudclient.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository  extends JpaRepository<Client,Integer> {
	Client findByName(String name);
}
