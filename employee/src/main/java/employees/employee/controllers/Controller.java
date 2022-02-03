package employees.employee.controllers;

import employees.employee.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final EmployeeService empService;
    @PostMapping("/createEmp")
    public String createEmp(@RequestParam String username){
        return "New employee: " + empService.createEmployee(username);
    }
}
