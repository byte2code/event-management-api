package com.cn.cnEvent.controller;

import java.awt.geom.CubicCurve2D;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cn.cnEvent.entity.Event;
import com.cn.cnEvent.service.EventService;



@RestController
@RequestMapping("/event")
public class EventController {
    
    @Autowired
    EventService eventService;
    
    	@GetMapping("/{id}")
	public Event getEventById(@PathVariable Long id)
	{
		return eventService.getEventById(id);
	}

	@GetMapping("/all")
	public List<Event> getAllEvents()
	{
		return eventService.getAllEvents();
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Event event){
	    return eventService.save(event);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
	    return eventService.delete(id);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Event updateEvent) {
	    return eventService.update(updateEvent);
	}
}
