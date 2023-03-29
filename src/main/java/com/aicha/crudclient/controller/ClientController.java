package com.aicha.crudclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aicha.crudclient.entity.Client;
import com.aicha.crudclient.service.ClientService;

@RestController
@RequestMapping("/Client")
@CrossOrigin
public class ClientController {
	 @Autowired
	    private ClientService service;

	    @PostMapping("/addClient")
	    public Client addClient(@RequestBody Client Client) {
	        return service.saveClient(Client);
	    }

	    @PostMapping("/addClients")
	    public List<Client> addClients(@RequestBody List<Client> Clients) {
	        return service.saveClients(Clients);
	    }

	    @GetMapping("/Clients")
	    public List<Client> findAllClients() {
	        return service.getClients();
	    }

	    @GetMapping("/ClientById/{id}")
	    public Client findClientById(@PathVariable int id) {
	        return service.getClientById(id);
	    }

	    @GetMapping("/Client/{name}")
	    public Client findClientByName(@PathVariable String name) {
	        return service.getClientByName(name);
	    }

	    @PutMapping("/update")
	    public Client updateClient(@RequestBody Client Client) {
	        return service.updateClient(Client);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteClient(@PathVariable int id) {
	        return service.deleteClient(id);
	    }

}
