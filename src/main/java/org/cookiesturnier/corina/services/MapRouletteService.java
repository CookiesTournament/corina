package org.cookiesturnier.corina.services;

import org.cookiesturnier.corina.enums.Gamemode;
import org.cookiesturnier.corina.enums.Map;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapRouletteService {

    private final SecureRandom secureRandom;

    public MapRouletteService() {
        this.secureRandom = new SecureRandom();
    }

    /**
     * Picks a random map from a certain gamemode
     * @param gamemode Gamemode of the map
     * @param onlyPublicMaps Determines if the wanted map should be publicly accessible
     * @param teamSize Determines the intended team size(s) of the map
     * @return Randomly selected map. Returns null if no suitable map could be found.
     */
    public Map getRandomMap(Gamemode gamemode, boolean onlyPublicMaps, int... teamSize) {
        final List<Map> availableMaps = Arrays.stream(Map.values())
                .filter(map -> map.getGamemode().equals(gamemode))
                .filter(map -> !onlyPublicMaps || map.isPublic())
                .filter(map -> {
                    for(int size : teamSize)
                        if(map.getTeamSize() == size) return true;
                    return false;
                })
                .collect(Collectors.toList());

        if(availableMaps.isEmpty()) return null;
        return availableMaps.get(this.secureRandom.nextInt(availableMaps.size()));
    }

}
