package org.cookiesturnier.corina.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "players")
@Getter
@Setter
public class Player {

    @Id
    @Column(nullable = false)
    private UUID uuid;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    private Long discordId;

    private String discordTag;

}
