package org.cookiesturnier.corina.enums;

import lombok.Getter;
import static org.cookiesturnier.corina.enums.Gamemode.*;

@Getter
public enum Map {

    AIRCRAFT(2, "AirCraft", false, COOKIES),
    ANNIVERSARY(2, "Anniversary", false, COOKIES),
    AURUMMEUM(2, "AurumMeum", true, COOKIES),
    BIGJUNGLE(2, "BigJungle", true, COOKIES),
    CHRISTMAS(4, "Christmas", false, COOKIES),
    CURRYWURST(2, "Currywurst", true, COOKIES),
    EXCALIBUR(4, "Excalibur", true, COOKIES),
    FABRICA(4, "Fabrica", true, COOKIES),
    FLOWERY(2, "Flowery", true, COOKIES),
    FOLIAGE(1, "Foliage", true, COOKIES),
    HALLOWEEN(4, "Halloween", false, COOKIES),
    HUGEJUNGLE(4, "HugeJungle", true, COOKIES),
    INDUSTRY(2, "Industry", true, COOKIES),
    MARIO(1, "Mario", true, COOKIES),
    MODERN(2, "Modern", true, COOKIES),
    SMALLJUNGLE(1, "SmallJungle", true, COOKIES),
    SPOOKY(4, "Spooky", true, COOKIES),
    STINGRAY(1, "Stingray", true, COOKIES),
    VEGETATION(2, "Vegetation", true, COOKIES),
    VEGETATION2(4, "Vegetation2", true, COOKIES),
    VILLA(4, "Villa", true, COOKIES),
    WESTERN(4, "Western", true, COOKIES),
    WINTER(4, "Winter", false, COOKIES);
//    ANUBIS(2, "Anubis", true, COOKIES); Coming soon :) ❤ Mirco L


    private final int teamSize;
    private final String mapName;
    private final boolean isPublic;
    private final Gamemode gamemode;

    Map(int teamSize, String mapName, boolean isPublic, Gamemode gamemode) {
        this.teamSize = teamSize;
        this.mapName = mapName;
        this.isPublic = isPublic;
        this.gamemode = gamemode;
    }
}
