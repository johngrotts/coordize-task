package com.coordize.coordizetask.repositories;

import com.coordize.coordizetask.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
