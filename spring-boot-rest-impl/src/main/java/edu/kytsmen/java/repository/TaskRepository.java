package edu.kytsmen.java.repository;

import edu.kytsmen.java.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
