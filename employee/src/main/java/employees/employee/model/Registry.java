package employees.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Registry {

    @Id
    @GeneratedValue
    private long id;
    private String employee;
    private LocalDateTime time;
    private String inOut;

    public Registry(String employee, LocalDateTime time, String inOut) {
        this.employee = employee;
        this.time = time;
        this.inOut = inOut;
    }
}
