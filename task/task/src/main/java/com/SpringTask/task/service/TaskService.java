package com.SpringTask.task.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.SpringTask.task.model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    void saveTask(Task task);
    Task getTaskById(long id);
	void deleteTaskById(long id);
	Page<Task> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}