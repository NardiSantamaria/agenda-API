package com.agendapp.agenda.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agendapp.agenda.entity.Status;
import com.agendapp.agenda.repository.StatusRepository;

@Service
public class StatusService {
    @Autowired
    StatusRepository statusrepo;

    public StatusService(StatusRepository statusrepo){
        this.statusrepo=statusrepo;
    }
    public List<Status> getAllStatus(){
        List<Status> listOfStatus = (List<Status>) statusrepo.findAll();
        List<Status> listaObjeto = StreamSupport.stream(listOfStatus.spliterator(),false)
        .collect(Collectors.toList());
        return listaObjeto;
    }
    public Optional<Status> getStatusById(Integer id){
        Optional<Status> status = statusrepo.findById(id);
        return status;
    }
}
