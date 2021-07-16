package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rounds")
@Getter
@Setter
public class Round {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "round_id")
    private List<Match> matches;
}
