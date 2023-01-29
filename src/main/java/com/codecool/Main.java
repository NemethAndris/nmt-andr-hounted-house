package com.codecool;

import com.codecool.hauntedhouse.BaseMonster;
import com.codecool.hauntedhouse.Guest;
import com.codecool.hauntedhouse.HauntedHouse;
import com.codecool.hauntedhouse.MonsterType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Mary"));

        List<BaseMonster> monsters = new ArrayList<>();
        BaseMonster monster = new BaseMonster(MonsterType.DEMON);
        monsters.add(monster);

        HauntedHouse hauntedHouse = new HauntedHouse(guests, monsters, new Random());

        hauntedHouse.startHaunting();
    }
}
