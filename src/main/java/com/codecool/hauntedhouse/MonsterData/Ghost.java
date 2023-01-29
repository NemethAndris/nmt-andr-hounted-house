package com.codecool.hauntedhouse.MonsterData;

import com.codecool.hauntedhouse.Guest;
import com.codecool.hauntedhouse.MonsterData.Monster;

public class Ghost implements Monster {
    @Override
    public boolean scare(Guest guest) {
        guest.setScaredLevel(guest.getScaredLevel() + 33);

        return guest.getScaredLevel() > 100;


    }
}
