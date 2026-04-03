package com.cn.cnEvent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.cnEvent.entity.Event;
import com.cn.cnEvent.entity.EventScheduleDetail;
import com.cn.cnEvent.service.EventScheduleDetailService;
import com.cn.cnEvent.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;

    @Autowired
    EventScheduleDetailService eventScheduleDetailService;

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
	return eventService.getEventById(id);
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
	return eventService.getAllEvents();
    }

    @PostMapping("/save")
    public String saveEvent(@RequestBody Event event) {
	return eventService.saveEvent(event);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Long id) {
	return eventService.delete(id);
    }

    @PutMapping("/update")
    public String updateEvent(@RequestBody Event updateEvent) {
	return eventService.update(updateEvent);
    }

    @GetMapping("/eventScheduleDetail/{id}")
    public EventScheduleDetail getSchedule(@PathVariable Long id) {
	return eventScheduleDetailService.getById(id);
    }

    @DeleteMapping("/delete/eventScheduleDetail/{id}")
    public String deleteSchedule(@PathVariable Long id) {
	return eventScheduleDetailService.delete(id);
    }

    @GetMapping("/location/{location}")
    public List<Event> getByLocation(@PathVariable String location) {
	return eventService.getByLocation(location);
    }

}
