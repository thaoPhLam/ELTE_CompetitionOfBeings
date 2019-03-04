package com.codecool.thao.competition.beings;

public class Sponge extends Being {
    public Sponge(int waterAmount, String name) {
        super(waterAmount, name);
        this.waterLimit = 20;
    }

    @Override
    public void reactToSunny() {
        this.waterAmount -= 4;
        this.distance += 0;
    }

    @Override
    public void reactToCloudy() {
        this.waterAmount -= 1;
        this.distance += 1;
    }

    @Override
    public void reactToRainy() {
        this.waterAmount += 6;
        this.distance += 3;
    }
}
