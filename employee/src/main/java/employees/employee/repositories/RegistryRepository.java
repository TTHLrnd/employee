package employees.employee.repositories;

import employees.employee.model.Registry;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface RegistryRepository extends JpaRepository<Registry, Long> {
}
