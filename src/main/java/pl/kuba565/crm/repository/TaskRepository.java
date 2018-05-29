package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
