package employees.employee.services;

import employees.employee.model.Employee;
import employees.employee.model.Registry;
import employees.employee.repositories.EmployeeRepository;
import employees.employee.repositories.RegistryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;
@Transactional
@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository empRepo;
    private final RegistryRepository regRepo;

    public String createEmployee(String username){
        String code = UUID.randomUUID().toString();
        Employee emp = new Employee(username, code, false);
        empRepo.save(emp);
        return emp.getUsername();
    }

    public Employee getByUsername(String username){
        return empRepo.findByUsername(username);
    }

}
