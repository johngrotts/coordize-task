package com.coordize.coordizetask.repositories;

import com.coordize.coordizetask.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<ArrayList<Task>> findAllByAssignerId(long assigneeId);

    Optional<ArrayList<Task>> findAllByAssigneeId(long assigneeId);

    Optional<ArrayList<Task>> findAllByTitle(String title);

    Optional<Task> findBySubTasks(Task subtask);
}
