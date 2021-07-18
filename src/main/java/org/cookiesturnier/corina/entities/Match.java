package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "matches")
@Getter
@Setter
public class Match {

    @Id
    @GenericGenerator(name = "match_id_generator", strategy = "org.cookiesturnier.corina.utils.MatchIdGenerator")
    @GeneratedValue(generator = "match_id_generator")
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

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Team winner;

    @Column(name = "match_date")
    private Date matchDate;

    @Column(name = "multi_match_winner_amount")
    private int multiMatchWinnerAmount;

    @ManyToOne
    @JoinColumn(name = "parent_match_id")
    private Match parentMatch;

    @OneToMany(mappedBy = "parentMatch", orphanRemoval = true)
    private List<Match> matches;

    public boolean isMultiMatch() {
        return this.matches.size() > 0;
    }

}
