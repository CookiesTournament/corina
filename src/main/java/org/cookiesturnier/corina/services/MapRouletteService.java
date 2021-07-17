package org.cookiesturnier.corina.services;

import com.google.common.collect.Lists;
import org.cookiesturnier.corina.enums.Gamemode;
import org.cookiesturnier.corina.enums.Map;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This file was created by VoxCrafter_LP!
 * Date: 18.07.2021
 * Time: 00:34
 * Project: corina
 */

@Service
public class MapRouletteService {

    private final SecureRandom secureRandom;

    public MapRouletteService() {
        this.secureRandom = new SecureRandom();
    }

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

        return availableMaps.get(this.secureRandom.nextInt(availableMaps.size()));
    }

}
