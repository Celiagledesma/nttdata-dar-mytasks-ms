package com.nttdata.nttdatadarmytsksms.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.nttdatadarmytsksms.controller.Tasks;

public class TaskRepositoryImpl implements TasksRepositoryCustom {

	@Autowired 
	TasksRepository repository;
	
	@Override
	public List<Tasks> findAllByStatus(String status) {

		List<Tasks> tasksWithStatus = new ArrayList<Tasks>();
		List<Tasks> tasks = repository.findAll();
		
		for(Tasks item : tasks) {
			if(item.getStatus().equalsIgnoreCase(status))
			{
				tasksWithStatus.add(item);
			}
		}
		return tasksWithStatus;
	}

}
