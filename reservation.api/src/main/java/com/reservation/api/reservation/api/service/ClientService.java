package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Client;
import com.reservation.api.reservation.api.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Iterable<Client> getAllClient() {

		return clientRepository.findAll();
	}

	public Optional<Client> getClienById(int id) {
		return clientRepository.findById(id);
	}

	public Client addClient(Client client) {

		return clientRepository.save(client);
	}

	public Client saveClient(Client client) {
		return clientRepository.save(client);

	}

	public Iterable<Client> savAllClient(Client client) {
		return clientRepository.saveAll(null);

	}

	// Supprimer un client

	public void deleteClient(Client client) {

		clientRepository.delete(client);

	}

	public void deleteClientById(Integer id) {

		clientRepository.deleteById(id);

	}

}

/*
 * 
 * package com.reservation.api.reservation.api.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.reservation.api.reservation.api.model.Spectateur; import
 * com.reservation.api.reservation.api.repository.SpectateurRepository;
 * 
 * 
 * 
 */
