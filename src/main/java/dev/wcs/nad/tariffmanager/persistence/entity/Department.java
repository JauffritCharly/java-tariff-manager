package dev.wcs.nad.tariffmanager.persistence.entity;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "department")
@Getter
@Setter
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", orphanRemoval = true)
    private Set<Tariff> tariffs = new LinkedHashSet<>();

    public void addTariff(Tariff tariff) {
        this.getTariffs().add(tariff);
        tariff.setDepartment(this);
    }

    
}
