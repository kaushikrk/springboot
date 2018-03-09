/**
 * 
 */
package com.example.actorsdirectory.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.actorsdirectory.model.Actor;

/**
 * @author kkk
 * Springboot repository for Actor Model.
 */
@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {

}
