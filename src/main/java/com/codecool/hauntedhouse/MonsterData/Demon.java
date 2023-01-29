package com.codecool.hauntedhouse.MonsterData;

import com.codecool.hauntedhouse.Guest;
import com.codecool.hauntedhouse.MonsterData.Monster;

public class Demon implements Monster {
    @Override
    public boolean scare(Guest guest) {
        guest.setHealthLevel(guest.getHealthLevel() - 10);
        guest.setScaredLevel(guest.getScaredLevel() + 7);

        return guest.getScaredLevel() > 100 || guest.getHealthLevel() < 4;
    }
}
