package pl.crm.app.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "tenant")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tenant_id")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @OneToMany(targetEntity = Invoice.class, mappedBy = "recipient")
    private List<Invoice> invoices;

    @OneToMany(targetEntity = Premis.class, mappedBy = "tenant")
    private List<Premis> premises;

}
