package com.nttdata.nttdatadarmytsksms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nttdata.nttdatadarmytsksms.repository.TasksRepository;
import com.nttdata.nttdatadarmytsksms.service.TaskService;

@RestController
public class TasksController {
	
	@Autowired
	TasksRepository repository;
	@Autowired
	TaskService service;
	
	@PostMapping("/addTask")
	public void addTaskImplementation(@RequestBody Tasks task) {
		repository.save(task);
		
		AddResponse ad = new AddResponse();
		ad.setMsg("The new task is added");
		//ad.setId(task.);
	}
	
	@GetMapping("/getTasks/{id}")
	public Tasks getTaskById(@PathVariable(value="id")String id)
	{
		try {
			Tasks task = repository.findById(id).get();
			return task;
		} catch (Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND); 
		}
		
	}
	
	@GetMapping("/getTasks/status")
	public List<Tasks> getTasksByStatus(@RequestParam(value="status")String status)
	{
		return repository.findAllByStatus(status);
		
	}
	
	@PutMapping("/updateTask/{id}")
	public ResponseEntity<Tasks> updateTask(@PathVariable(value="id")String id, @RequestBody Tasks task) 
	{
		Tasks existingTask = repository.findById(id).get();
		
		existingTask.setStatus(task.getStatus());
		existingTask.setDescription(task.getDescription());
		repository.save(existingTask);
		
		return new ResponseEntity<Tasks>(existingTask, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteTask")
	public void deleteBookById(@RequestBody Tasks task)
	{
		Tasks taskDelete = repository.findById(task.getId()).get();
		repository.delete(taskDelete);
	}
	
	@GetMapping("/getAllTasks")
	public List<Tasks> getAllTasks(){
		return repository.findAll();
	}
}
