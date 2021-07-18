package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * This file was created by VoxCrafter_LP!
 * Date: 18.07.2021
 * Time: 18:13
 * Project: corina
 */

@Entity
@Table(name = "sub_matches")
@Getter
@Setter
public class SubMatch {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToMany
    @JoinTable(name = "SUBMATCH_TEAM",
            joinColumns = @JoinColumn(name = "SUBMATCH_id"),
            inverseJoinColumns = @JoinColumn(name = "TEAM_id"))
    private List<Team> teams;

    @Column(name = "winner")
    private Team winner;

    @Column(name = "submatch_date")
    private Date subMatchDate;

}
