package com.nttdata.nttdatadarmytsksms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.nttdatadarmytsksms.controller.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, String>, TasksRepositoryCustom {

}
