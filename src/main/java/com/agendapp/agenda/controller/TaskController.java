package com.agendapp.agenda.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendapp.agenda.entity.Task;
import com.agendapp.agenda.service.TaskService;

@CrossOrigin("*")
@RestController
@RequestMapping("/task")
public class TaskController {
    
    public TaskService taskService;
    
    @Autowired
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>>getTasks(){
        try{
            List<Task> listOfTaks=taskService.getListTasks();
            return new ResponseEntity<List<Task>>(listOfTaks,HttpStatus.OK);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/taskNoScheduled")
    public ResponseEntity<List<Task>>getTasksNoSqueduled(){
        try{
            List<Task> listOfTaks=taskService.getListTasksNoSqueduled();
            return new ResponseEntity<List<Task>>(listOfTaks,HttpStatus.OK);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/task/create")
    public Task createTask(@RequestBody Task task){
        System.out.println(Thread.currentThread().getPriority());
        return taskService.createTask(task);
    }

    @PutMapping("/task/update")
    public Task updateTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping("/task/delete")
    public boolean createTask(@RequestBody int id){
        return taskService.deleteTask(id);
    }
}
