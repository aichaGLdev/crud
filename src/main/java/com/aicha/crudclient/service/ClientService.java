package com.aicha.crudclient.service;

import com.aicha.crudclient.entity.Client;
import com.aicha.crudclient.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
	 @Autowired
	    private ClientRepository repository;

	    public Client saveClient(Client client) {
	        return repository.save(client);
	    }

	    public List<Client> saveClients(List<Client> clients) {
	        return repository.saveAll(clients);
	    }
	    public List<Client> getClients() {
	        return repository.findAll();
	    }

	    public Client getClientById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Client getClientByName(String name) {
	        return repository.findByName(name);
	    }

	    public String deleteClient(int id) {
	        repository.deleteById(id);
	        return "client removed !! " + id;
	    }

	    public Client updateClient(Client client) {
	        Client existingClient = repository.findById(client.getId()).orElse(null);
	        existingClient.setName(client.getName());
	        existingClient.setPrenom(client.getPrenom());
	        existingClient.setSecteur(client.getSecteur());
	        existingClient.setMetier(client.getMetier());
	        existingClient.setAdresse(client.getAdresse());
	        existingClient.setAge(client.getAge());
	        existingClient.setNum(client.getNum());
	        return repository.save(existingClient);
	    }

}
