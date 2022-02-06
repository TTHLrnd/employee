package employees.employee.controllers;

import employees.employee.model.Registry;
import employees.employee.services.RegistryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RegistryController {

    private final RegistryService registryService;

    @GetMapping("/registry")
    public List<Registry> showRegistry(){
        return registryService.showRegistry();
    }

    @PostMapping("/log")
    public String log(@RequestParam String code){
        return registryService.logRegistry(code);
    }
}
