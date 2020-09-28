package com.tce.javabean.charater;

import com.tce.javabean.charater.pc.Background;

public class PlayerCharacter extends AbstractCharacter{
    /**
     * 种族
     */
    private String race;
    /**
     * 玩家名
     */
    private String playerName;

    private Background backgroud;

    public PlayerCharacter(String en_name, String cn_name, int str, int dex, int intel, int wis, int chma, String ali) {
        super(en_name, cn_name, str, dex, intel, wis, chma, ali);
    }
}
