package pl.crm.app.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long id;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "manager_password")
    private String managerPassword;

    @OneToMany(targetEntity = Owner.class, mappedBy = "manager")
    private List<Owner> owners;
}
