package com.javaProgram.ticketBooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaProgram.ticketBooking.model.Railway;

@Repository
public interface RailwayDao extends CrudRepository<Railway, Integer> {

}
