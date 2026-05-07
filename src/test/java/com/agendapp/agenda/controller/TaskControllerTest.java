package com.agendapp.agenda.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import com.agendapp.agenda.entity.Task;
import com.agendapp.agenda.service.TaskService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TaskController.class)
class TaskControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TaskService taskService;

	private final ObjectMapper mapper = new ObjectMapper();

	@Test
	void createTask_shouldReturnCreatedTask() throws Exception {
		Task request = new Task();
		request.setTaskTittle("New Task");

		Task saved = new Task();
		saved.setIdTask(10);
		saved.setTaskTittle("New Task");

		when(taskService.createTask(org.mockito.ArgumentMatchers.any(Task.class))).thenReturn(saved);

		String body = mapper.writeValueAsString(request);

		mockMvc.perform(post("/task/task/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(body))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.idTask").value(10))
				.andExpect(jsonPath("$.taskTittle").value("New Task"));
	}

}
