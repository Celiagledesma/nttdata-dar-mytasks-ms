package com.nttdata.nttdatadarmytsksms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.nttdatadarmytsksms.repository.TasksRepository;

@Service
public class TaskService {

	@Autowired
	TasksRepository repository;
	
	//métodos q necesite
}
