package org.cookiesturnier.corina.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "is_camera", nullable = false)
    private boolean isCamera = false;

    @Column(name = "is_party_leader", nullable = false)
    private boolean isPartyLeader;

    @Column(name = "has_sound", nullable = false)
    private boolean hasSound;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "channel_number")
    private int channelNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_uuid", nullable = false)
    private Player player;


}
