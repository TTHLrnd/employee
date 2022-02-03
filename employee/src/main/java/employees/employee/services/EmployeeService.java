package employees.employee.services;

import employees.employee.model.Employee;
import employees.employee.model.Registry;
import employees.employee.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.UUID;
@Transactional
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository empRepo;

    public String createEmployee(String username){
        String code = UUID.randomUUID().toString();
        Employee emp = new Employee(username, code);
        empRepo.save(emp);
        return emp.getUsername();
    }

    public Employee getByUsername(String username){
        return empRepo.findByUsername(username);
    }

    public String updateRegistry(String code){
        Employee emp = empRepo.findByCode(code);
        String inOut;
        if (!emp.getIsHere()){
            inOut = "Arrived";
            emp.setIsHere(true);
        } else {
            inOut ="Left";
            emp.setIsHere(false);
        }

        Registry reg = new Registry(emp.getUsername(), LocalDateTime.now(), inOut);

        return "asd";
    }
}
