package com.cn.cnEvent.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnEvent.dal.EventScheduleDetailDAL;
import com.cn.cnEvent.entity.EventScheduleDetail;
import com.cn.cnEvent.exception.ElementAlreadyExistException;
import com.cn.cnEvent.exception.InvalidInputException;
import com.cn.cnEvent.exception.NotFoundException;

@Service
@Transactional
public class EventScheduleDetailService {

    @Autowired
    EventScheduleDetailDAL dal;

    public EventScheduleDetail getById(Long id) {
	EventScheduleDetail d = dal.getById(id);
	if (d == null)
	    throw new NotFoundException("Schedule not found");
	return d;
    }

    public List<EventScheduleDetail> getAll() {
	return dal.getAll();
    }

    public void save(EventScheduleDetail d) {
	if (d.getId() != null && dal.getById(d.getId()) != null)
	    throw new ElementAlreadyExistException("Already exists");
	dal.save(d);
    }

    public String delete(Long id) {

	EventScheduleDetail detail = dal.getById(id);

	if (detail == null)
	    throw new InvalidInputException("Invalid schedule id");

	dal.delete(id);

	return "The eventSchedule was deleted successfully";
    }

}
