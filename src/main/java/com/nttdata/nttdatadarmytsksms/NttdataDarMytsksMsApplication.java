package com.nttdata.nttdatadarmytsksms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.nttdatadarmytsksms.controller.Tasks;
import com.nttdata.nttdatadarmytsksms.repository.TasksRepository;

@SpringBootApplication
public class NttdataDarMytsksMsApplication{
	
	@Autowired
	TasksRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdataDarMytsksMsApplication.class, args);
	}
	
//	@Override
//	public void run(String[] args) 
//	{
//		Tasks lib = repository.findById(1).get();
//		System.out.println(lib.getStatus());
//	}
	

}
