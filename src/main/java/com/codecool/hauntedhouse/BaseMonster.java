package com.codecool.hauntedhouse;

public class BaseMonster {
    MonsterType monsterType;

    public BaseMonster(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public boolean scare(Guest guest) {
        switch (this.monsterType) {
            case DEMON:
                guest.healthLevel -= 10;
                guest.scaredLevel += 7;
                break;
            case GHOST:
                guest.scaredLevel += 33;
                break;
            case VAMPIRE:
                guest.energyLevel -= 40;
                break;
        }
        return guest.scaredLevel > 100 || guest.energyLevel < 25 || guest.healthLevel < 4;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }
}
