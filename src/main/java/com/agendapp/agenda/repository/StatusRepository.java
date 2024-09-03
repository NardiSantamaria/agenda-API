package com.agendapp.agenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.agendapp.agenda.entity.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer>{

}
