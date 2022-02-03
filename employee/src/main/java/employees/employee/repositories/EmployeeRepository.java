package employees.employee.repositories;

import employees.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    @Override
    Employee getById(Long aLong);

    Employee findByCode(String code);

    Employee findByUsername(String username);
}
