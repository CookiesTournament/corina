package org.cookiesturnier.corina.repositories;

import org.cookiesturnier.corina.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PlayerRepo extends JpaRepository<Player, UUID> {

    Optional<Player> getByUsername(String username);

}
