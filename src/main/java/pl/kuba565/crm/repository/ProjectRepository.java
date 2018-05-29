package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
