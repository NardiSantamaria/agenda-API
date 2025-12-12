package com.agendapp.agenda.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agendapp.agenda.entity.Status;
import com.agendapp.agenda.service.StatusService;

@CrossOrigin("*")
@RestController
@RequestMapping("/status")
public class StatusController implements Test2Interface {
    @Autowired
    StatusService statusService;

    public StatusController(StatusService statusService){
        this.statusService= statusService;
        
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Status>> getStatusList(){
        List<Status> listOfstatus = statusService.getAllStatus();
        return new ResponseEntity<List<Status>>(listOfstatus,HttpStatus.OK);
    }
    @GetMapping("/getStatus/{id}")
    public Optional<Status> getStatusById(@PathVariable Integer id){
        Optional<Status> status= statusService.getStatusById(id);
        return status;
    }


    public void volar() {
        System.out.println("Estoy volando");
        variableFI.method1();
    }

    CatInterface lamda = str -> {return str.equals("Miau");};
   

    FuncionalInterTest variableFI = () -> {
        System.out.println("Implementacion de interfaz funcional");
    };

    
    
  
}
