package com.codecool.hauntedhouse;

import com.codecool.hauntedhouse.MonsterData.Demon;
import com.codecool.hauntedhouse.MonsterData.Ghost;
import com.codecool.hauntedhouse.MonsterData.Monster;
import com.codecool.hauntedhouse.MonsterData.Vampire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HauntedHouse {
    List<Guest> guestList;
    List<Monster> monsterList;

    public HauntedHouse() {
        this.guestList = guestListGenerator();
        this.monsterList = monsterListGenerator();

    }

    public String randomName() {
        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Vincze Rajmund",
                "Mezei Károly",
                "Szabó Kristóf",
                "Pintér Zalán",
                "Novák Béla",
                "Németh János",
                "Katona Krisztián",
                "Miksa Csaba",
                "Gál Áron",
                "Juhász Márió",
                "Lakatos Barbara",
                "Fazekas Szilvia",
                "Somogyi Dorka",
                "Farkas Réka",
                "Szücs Liliána",
                "Bakos Dzsenifer",
                "Pap Kamilla",
                "Péter Martina",
                "Bács Eszter",
                "Székely Evelin",
                "Máté Donát",
                "Orsós Mihály",
                "Csatár Szilárd",
                "Tamás Alexander",
                "Székely Csaba",
                "Szalai Tibor",
                "Egyed Antal",
                "Jónás Barna",
                "Dudás Zalán",
                "László Dominik"
        ));
        int rnd = new Random().nextInt(nameList.size());

        return nameList.get(rnd);

    }


    private List<Guest> guestListGenerator() {
        List<Guest> guests = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Guest guest = new Guest(randomName());
            guests.add(guest);
        }

        return guests;
    }

    private List<Monster> monsterListGenerator() {
        List<Monster> monsterList = new ArrayList<>();
        Monster vampire = new Vampire();
        Monster ghost = new Ghost();
        Monster demon = new Demon();

        monsterList.add(vampire);
        monsterList.add(ghost);
        monsterList.add(demon);

        return monsterList;

    }


    public void startHaunting() {
        Random random = new Random();
        int randomNumber = random.nextInt(monsterList.size());

        Monster randomMonster = monsterList.get(randomNumber);

        for (int i = 0; i < 6; i++) {
            for (Guest guest : guestList) {
                if (!randomMonster.scare(guest)) {
                    guestList.remove(guest);
                }
            }
        }
        System.out.println(guestList);

    }
}
