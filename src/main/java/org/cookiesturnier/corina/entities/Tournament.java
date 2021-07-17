package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tournaments")
@Getter
@Setter
public class Tournament {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "tournament_id")
    private List<Employee> employees;

}
