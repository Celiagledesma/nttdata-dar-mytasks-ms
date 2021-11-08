package com.nttdata.nttdatadarmytsksms.repository;

import java.util.List;

import com.nttdata.nttdatadarmytsksms.controller.Tasks;

public interface TasksRepositoryCustom {

	List<Tasks> findAllByStatus(String status);
}
