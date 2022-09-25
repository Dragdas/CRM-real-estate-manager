package pl.crm.app.domain.models;

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

    public Owner(Long id, String ownerName, String forwardingAddress, String dataToInvoice, String addressToInvoice) {
        this.id = id;
        this.ownerName = ownerName;
        this.forwardingAddress = forwardingAddress;
        this.dataToInvoice = dataToInvoice;
        this.addressToInvoice = addressToInvoice;
    }

    @Id
    @GeneratedValue
    @Column(name = "owner_id", nullable = false)
    private Long id;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "forwarding_address")
    private String forwardingAddress;

    @Column(name = "data_to_invoice")
    private String dataToInvoice;

    @Column(name = "address_to_invoice")
    private String addressToInvoice;

    @OneToMany(targetEntity = Invoice.class, mappedBy = "issuer")
    private List<Invoice> invoices;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany(targetEntity = RealEstate.class, mappedBy = "owner")
    private List<RealEstate> realEstates;
}
