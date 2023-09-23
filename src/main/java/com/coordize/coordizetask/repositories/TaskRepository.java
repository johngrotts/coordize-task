package com.coordize.coordizetask.repositories;

import com.coordize.coordizetask.models.Task;
import com.coordize.coordizeuser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<ArrayList<Task>> findAllUsingAssigner(User user);

    Optional<ArrayList<Task>> findAllUsingAssignee(User user);

    Optional<ArrayList<Task>> findAllUsingTitle(String title);

    Optional<Task> findUsingSubTask(Task subtask);
}
