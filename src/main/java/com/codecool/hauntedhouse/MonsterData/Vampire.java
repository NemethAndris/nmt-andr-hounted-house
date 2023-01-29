package com.codecool.hauntedhouse.MonsterData;

import com.codecool.hauntedhouse.Guest;
import com.codecool.hauntedhouse.MonsterData.Monster;

public class Vampire implements Monster {
    @Override
    public boolean scare(Guest guest) {
        guest.setEnergyLevel(guest.getEnergyLevel() - 40);

        return guest.getEnergyLevel() < 25;
    }
}
