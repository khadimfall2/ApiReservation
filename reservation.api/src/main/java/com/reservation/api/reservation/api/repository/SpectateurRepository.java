package com.reservation.api.reservation.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservation.api.reservation.api.model.Spectateur;

@Repository
public interface SpectateurRepository extends CrudRepository<Spectateur, Integer> {

}
