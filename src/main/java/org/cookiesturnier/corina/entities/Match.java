package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "matches")
@Getter
@Setter
public class Match {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "round_id", nullable = false)
    private Round round;

    @ManyToMany
    @JoinTable(name = "MATCH_TEAM",
            joinColumns = @JoinColumn(name = "MATCH_id"),
            inverseJoinColumns = @JoinColumn(name = "TEAM_id"))
    private List<Team> teams;

}
