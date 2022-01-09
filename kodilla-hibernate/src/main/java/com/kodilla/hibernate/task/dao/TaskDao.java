package com.kodilla.hibernate.task.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}