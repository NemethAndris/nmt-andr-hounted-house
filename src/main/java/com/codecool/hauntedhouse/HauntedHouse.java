package com.codecool.hauntedhouse;

import java.util.List;
import java.util.Random;

public class HauntedHouse {
    List<Guest> guestList;
    List<BaseMonster> monsterList;
    Random random;

    public HauntedHouse(List<Guest> guestList, List<BaseMonster> monsterList, Random random) {
        this.guestList = guestList;
        this.monsterList = monsterList;
        this.random = random;
    }


    public void startHaunting(){
        // each guest should be scared by a random monster selected from the monsterList
        // if it gets too scary for a guest, remove the guest from the list
    }
}
