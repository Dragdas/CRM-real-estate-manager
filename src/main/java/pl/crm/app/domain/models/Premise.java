package pl.crm.app.domain.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "premise")
public class Premise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "premise_id")
    private Long id;

    @Column(name = "identifier")
    private String identifier;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @ManyToOne
    @JoinColumn(name = "real_estate_id")
    private RealEstate realEstate;

    @Column(name = "rent")
    @NotNull
    private BigDecimal rent;

}
