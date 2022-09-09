package pl.crm.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "owner")
public class Owner {

    @Id
    @GeneratedValue
    @Column(name = "owner_id", nullable = false)
    private long id;

    @Column(name = "owner_name")
    private String ownerName;

    @OneToMany(targetEntity = Invoice.class, mappedBy = "issuer")
    private List<Invoice> invoices;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany(targetEntity = RealEstate.class, mappedBy = "owner")
    private List<RealEstate> realEstates;
}
