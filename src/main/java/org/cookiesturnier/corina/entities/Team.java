package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Table(name = "teams")
@Getter
@Setter
public class Team {

    @Id
    @Column(nullable = false)
    private Long id;

    private String name;

    @OneToMany
    private List<Player> players;

    @Column(name = "color")
    private Color color;

}
