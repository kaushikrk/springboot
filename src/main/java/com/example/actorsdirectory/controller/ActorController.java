package com.example.actorsdirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.actorsdirectory.model.Actor;
import com.example.actorsdirectory.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	ActorService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Actor getActor(@PathVariable long actorId) {
		return service.getActor(actorId);
	}
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Actor> getActors() {
		return service.getActor();
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void saveAcor(@RequestBody Actor actor){
		service.saveActor(actor);
	}
	@RequestMapping(value="/saveAll", method=RequestMethod.POST)
	public void saveAcor(@RequestBody List<Actor> actors){
		service.saveActor(actors);
	}
}
