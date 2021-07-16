package org.cookiesturnier.corina.enums;

public enum Map {

    AIRCRAFT(2, "AirCraft", false),
    ANNIVERSARY(2, "Anniversary", false),
    AURUMMEUM(2, "AurumMeum", true),
    BIGJUNGLE(2, "BigJungle", true),
    CHRISTMAS(4, "Christmas", false),
    CURRYWURST(2, "Currywurst", true),
    EXCALIBUR(4, "Excalibur", true),
    FABRICA(4, "Fabrica", true),
    FLOWERY(2, "Flowery", true),
    FOLIAGE(1, "Foliage", true),
    HALLOWEEN(4, "Halloween", false),
    HUGEJUNGLE(4, "HugeJungle", true),
    INDUSTRY(2, "Industry", true),
    MARIO(1, "Mario", true),
    MODERN(2, "Modern", true),
    SMALLJUNGLE(1, "SmallJungle", true),
    SPOOKY(4, "Spooky", true),
    STINGRAY(1, "Stingray", true),
    VEGETATION(2, "Vegetation", true),
    VEGETATION2(4, "Vegetation2", true),
    VILLA(4, "Villa", true),
    WESTERN(4, "Western", true),
    WINTER(4, "Winter", false);
//    ANUBIS(2, "Anubis", true); Coming soon :) ❤ Mirco L


    private int teamSize;
    private String mapName;
    private boolean isPublic;

    Map(int teamSize, String mapName, boolean isPublic) {
        this.teamSize = teamSize;
        this.mapName = mapName;
        this.isPublic = isPublic;
    }
}
