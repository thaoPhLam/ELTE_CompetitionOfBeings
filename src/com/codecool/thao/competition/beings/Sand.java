package com.codecool.thao.competition.beings;

public class Sand extends Being {
    public Sand(int waterAmount, String name) {
        super(waterAmount, name);
        this.waterLimit = 8;
    }

    @Override
    public void reactToSunny() {
        this.waterAmount -= 1;
        this.distance += 3;
    }

    @Override
    public void reactToCloudy() {
        this.waterAmount += 0;
        this.distance += 1;
    }

    @Override
    public void reactToRainy() {
        this.waterAmount += 3;
        this.distance += 0;
    }
}
