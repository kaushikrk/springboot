package com.example.actorsdirectory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.actorsdirectory.dao.ActorRepository;
import com.example.actorsdirectory.model.Actor;

@Service
public class ActorService {

	@Autowired
	ActorRepository repo;
	
	public Actor getActor(Long actorId){
		return repo.findOne(actorId);
	}
	public List<Actor> getActor(){
		List<Actor> actorsList= new ArrayList<Actor>();
		repo.findAll().forEach(actorsList::add);
		return actorsList;
	}
	public void saveActor(Actor actor){
		repo.save(actor);
	}
	public void saveActor(List<Actor> actors){
		repo.save(actors);
	}
}
