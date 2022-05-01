package mapping.entity.practice1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_addr_id")
//    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private List<Address> address;
}
