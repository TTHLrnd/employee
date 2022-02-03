package employees.employee.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Employee  {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    @Column(unique = true)
    private String code;
    private Boolean isHere = false;


    public Employee(String username, String code) {
        this.username = username;
        this.code = code;
    }
}
