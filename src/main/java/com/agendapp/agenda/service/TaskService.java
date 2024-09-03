package com.agendapp.agenda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import com.agendapp.agenda.entity.Task;
import com.agendapp.agenda.repository.TaskRepository;

@Service
public class TaskService {
    private static TaskService tasks= null;
    private TaskRepository taskRepository;

    public static TaskService create(TaskRepository taskRepository){
        if(tasks==null){
            tasks=new TaskService(taskRepository);
        }
        return tasks;
    }

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
        List<Task> listOfTask=(List<Task>) taskRepository.findAll();
        List<Task> listaObjeto = StreamSupport.stream(listOfTask.spliterator(),false)
        .collect(Collectors.toList());
        return listaObjeto;
    }

}
