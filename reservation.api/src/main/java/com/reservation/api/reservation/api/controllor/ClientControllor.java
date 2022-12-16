package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.api.reservation.api.model.Client;
import com.reservation.api.reservation.api.service.ClientService;

@RestController
public class ClientControllor {

	@Autowired

	private ClientService clientService;

	@GetMapping("/client") // get mapping nom de la table
	public Iterable<Client> getAllClients() {

		return clientService.getAllClient();

	}

	@GetMapping("/client/{id}")

	public Optional<Client> getBilletById(@PathVariable Integer id) {

		return this.clientService.getClienById(id);
	}

	@PostMapping

	public Client postClient(@RequestBody Client client) {
		return clientService.addClient(client);

	}

	@DeleteMapping("/client/{id}")
	public void deletClient(@PathVariable("id") final Integer id) {
		clientService.deleteClientById(id);
	}

}
