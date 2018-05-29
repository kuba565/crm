package pl.kuba565.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba565.crm.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
