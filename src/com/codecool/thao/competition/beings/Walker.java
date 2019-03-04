package com.codecool.thao.competition.beings;

public class Walker extends Being {
    public Walker(int waterAmount, String name) {
        super(waterAmount, name);
        this.waterLimit = 12;
    }

    @Override
    public void reactToSunny() {
        this.waterAmount -= 2;
        this.distance += 1;
    }

    @Override
    public void reactToCloudy() {
        this.waterAmount -= 1;
        this.distance += 2;
    }

    @Override
    public void reactToRainy() {
        this.waterAmount += 3;
        this.distance += 1;
    }
}
