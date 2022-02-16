package com.cg.onlineplantnursery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.entity.Tutorial;

@Repository
public interface ITutorialRepository extends CrudRepository<Tutorial, Integer>,CustomCustomerRepo {

}
