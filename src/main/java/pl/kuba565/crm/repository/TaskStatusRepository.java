package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.TaskStatus;

public interface TaskStatusRepository  extends JpaRepository<TaskStatus, Long> {
}
