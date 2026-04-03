package com.cn.cnEvent.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnEvent.entity.EventScheduleDetail;

@Repository
@Transactional
public class EventScheduleDetailDALImpl implements EventScheduleDetailDAL {

    @Autowired
    EntityManager entityManager;

    public EventScheduleDetail getById(Long id){
        return entityManager.find(EventScheduleDetail.class,id);
    }

    public List<EventScheduleDetail> getAll(){
        return entityManager.createQuery("FROM EventScheduleDetail",EventScheduleDetail.class).getResultList();
    }

    public void save(EventScheduleDetail detail){
        entityManager.persist(detail);
    }

    public void delete(Long id){
        EventScheduleDetail d = getById(id);
        if(d!=null) entityManager.remove(d);
    }
}

