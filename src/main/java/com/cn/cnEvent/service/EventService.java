package com.cn.cnEvent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.cnEvent.dal.EventDAL;
import com.cn.cnEvent.entity.Event;


@Service
public class EventService {
    
    @Autowired
    EventDAL eventDAL;

    @Transactional
    public Event getEventById(Long id) {
	return eventDAL.getById(id);
    }

    @Transactional
    public List<Event> getAllEvents() {
	return eventDAL.getAllEvents();
    }

    @Transactional
    public String save(Event event) {
	return eventDAL.save(event);
    }

    @Transactional
    public String delete(Long id) {
	return eventDAL.delete(id);
    }

    @Transactional
    public String update(Event updateEvent) {
	return eventDAL.update(updateEvent);
    }

}
