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
    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "discord_id")
    private Long discordId;

    @Column(name = "discord_tag")
    private String discordTag;

    @Column(name = "is_admin")
    private Boolean isAdmin;

}
