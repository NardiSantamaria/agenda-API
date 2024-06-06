package com.agendapp.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.agendapp.agenda.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer>{
   
} 
