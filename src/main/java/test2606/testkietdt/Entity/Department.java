package test2606.testkietdt.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
