package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;
import org.cookiesturnier.corina.enums.Gamemode;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "tournaments")
@Getter
@Setter
public class Tournament {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organizer_uuid", nullable = false)
    private Player organizer;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "tournament_id")
    private List<Employee> employees;

    @Column(name = "max_team_size")
    private int maxTeamSize;

    @Enumerated
    @Column(name = "gamemode")
    private Gamemode gamemode;

    @Column(name = "signup_start_date")
    private Date signupStartDate;

    @Column(name = "signup_end_date")
    private Date signupEndDate;

    @Column(name = "tournament_start_date")
    private Date tournamentStartDate;

    @ElementCollection
    @CollectionTable(name = "possible_stream_dates", joinColumns = @JoinColumn(name = "tournament_id"))
    @Column(name = "possible_stream_date")
    private List<Date> possibleStreamDates;

    @Column(name = "stream_key")
    private String streamKey;
}
