package com.reservation.api.reservation.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservation.api.reservation.api.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
