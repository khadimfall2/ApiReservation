package com.reservation.api.reservation.api.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.reservation.api.reservation.api.model.Billet;
import org.hibernate.annotations.DynamicUpdate;

@Repository
public interface BilletRepository extends CrudRepository <Billet,Integer> {

}
