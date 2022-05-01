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
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addr_id")
    private Long addrId;
    private String city;
    private String addressType;

//    @ManyToOne
//    @JoinColumn(name = "fk_emp_id")
//    private Employee employee;
}
