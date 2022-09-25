package pl.crm.app.domain.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "invoice_entry")
public class InvoiceEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "net_value")
    private BigDecimal netValue;

    @Column(name = "vat_rate")
    private double vatRate;

    @Column(name = "settled")
    private boolean settled;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}
