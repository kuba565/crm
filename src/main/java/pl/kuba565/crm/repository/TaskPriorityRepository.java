package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.TaskPriority;

public interface TaskPriorityRepository  extends JpaRepository<TaskPriority, Long> {
}
