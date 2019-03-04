package com.codecool.thao.competition.beings;

import com.codecool.thao.competition.Weather;

public abstract class Being {
    protected boolean alive = true;
    protected int distance;
    protected int waterAmount;
    protected String name;
    protected int waterLimit;

    public Being(int waterAmount, String name) {
        this.waterAmount = waterAmount;
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void checkWater() {
        if (this.waterAmount == 0) {
            die();
        }
    }

    public void die() {
        this.alive = false;
        System.out.println(name + " died!");
    }

    public void checkWaterLimit() {
        if (this.waterAmount > this.waterLimit) {
            System.out.println(name + " reached its limit");
            this.waterAmount = this.waterLimit;
        }
    }

    public void reactToWeather(Weather weather) {
        if (weather.equals(Weather.SUNNY)) {
            reactToSunny();
        } else if (weather.equals(Weather.CLOUDY)) {
            reactToCloudy();
        } else if (weather.equals(Weather.RAINY)) {
            reactToRainy();
        }
    }

    public abstract void reactToSunny();
    public abstract void reactToCloudy();
    public abstract void reactToRainy();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                ", distance=" + distance +
                ", waterAmount=" + waterAmount +
                '}';
    }
}
