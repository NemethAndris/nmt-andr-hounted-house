package com.codecool.hauntedhouse;

public class Guest {
    int scaredLevel = 0;
    int energyLevel = 100;
    int healthLevel = 100;
    String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getScaredLevel() {
        return scaredLevel;
    }

    public void setScaredLevel(int scaredLevel) {
        this.scaredLevel = scaredLevel;
    }

    public boolean isTooScared(){
        return  this.scaredLevel > 100 || this.energyLevel < 25 || this.healthLevel < 4;
    }

}