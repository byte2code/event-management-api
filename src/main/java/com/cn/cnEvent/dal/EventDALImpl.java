package com.cn.cnEvent.dal;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnEvent.entity.Event;


@Repository
public class EventDALImpl implements EventDAL {
    
    @Autowired
    EntityManager entityManager;

    @Override
    public Event getById(Long id) {
	Session session = entityManager.unwrap(Session.class); // session object
	Event event = session.get(Event.class, id);
	return event;
    }

    @Override
    public List<Event> getAllEvents() {
	Session session = entityManager.unwrap(Session.class);
	List<Event> allEvents= session.createQuery(
			"SELECT p FROM Event p", Event.class).getResultList();
	return allEvents;
    }

    @Override
    public String save(Event event) {
	Session session = entityManager.unwrap(Session.class); // session object
	session.save(event);
	return "The event was saved successfully.";
    }

}
