package employees.employee.services;

import employees.employee.model.Employee;
import employees.employee.model.Registry;
import employees.employee.repositories.EmployeeRepository;
import employees.employee.repositories.RegistryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class RegistryService {

    private final RegistryRepository regRepo;
    private final EmployeeRepository empRepo;

    public String logRegistry(String code){
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
        regRepo.save(reg);

        return "asd";
    }

    public List<Registry> showRegistry(){
        return regRepo.findAll();
    }
}
