package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.Task;

import javax.persistence.Entity;

@Entity
public interface TaskRepository extends JpaRepository<Task, Long> {
}
