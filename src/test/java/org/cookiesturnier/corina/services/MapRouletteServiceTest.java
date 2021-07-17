package org.cookiesturnier.corina.services;

import org.cookiesturnier.corina.enums.Gamemode;
import org.cookiesturnier.corina.enums.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class MapRouletteServiceTest {

    private final MapRouletteService mapRouletteService;

    public MapRouletteServiceTest() {
        this.mapRouletteService = new MapRouletteService();
    }

    @Test
    @DisplayName("Test with duo cookies map")
    public void testCookiesDuo() {
        Map result = mapRouletteService.getRandomMap(Gamemode.COOKIES, false, 2);
        assertEquals(Gamemode.COOKIES, result.getGamemode(), "Gamemode wrong");
        assertEquals(2, result.getTeamSize(), "Team size is wrong");
    }

    @Test
    @DisplayName("Test with duo or squad public cookies map")
    public void testCookiesDuoSquadPublic() {
        Map result = mapRouletteService.getRandomMap(Gamemode.COOKIES, true, 2, 4);
        assertEquals(Gamemode.COOKIES, result.getGamemode(), "Gamemode wrong");
        assertTrue(result.getTeamSize() == 2 || result.getTeamSize() == 4, "Team size is wrong");
        assertTrue(result.isPublic(), "Map is not public");
    }

}