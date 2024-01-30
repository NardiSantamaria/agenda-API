package com.agendapp.agenda.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.agendapp.agenda.entity.Task;
import com.agendapp.agenda.repository.TaskRepository;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    public boolean deleteTask(int id){
        if(taskRepository.existsById(id)){
            taskRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Task> getListTasks(){
        List<Task> listOfTask;
        listOfTask=(List<Task>) taskRepository.findAll();
        return listOfTask;
    }

}
