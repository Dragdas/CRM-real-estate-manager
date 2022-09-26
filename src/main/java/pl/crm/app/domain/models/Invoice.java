package pl.crm.app.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long id;

    @Column(name = "invoice_identyfier")
    private String invoiceIdentyfier;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Owner issuer;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant recipient;

    @OneToMany(targetEntity = InvoiceEntry.class, mappedBy = "invoice")
    private List<InvoiceEntry> invoiceEntries;

}
