package test2606.testkietdt.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;
    private String company_name;

    @ManyToOne
    @JoinColumn(name = "coporation_id")
    private Coporation coporation;
}
