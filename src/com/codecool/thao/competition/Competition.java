package com.codecool.thao.competition;

import com.codecool.thao.competition.beings.Being;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private List<Being> beings = new ArrayList();

    public void registerContestant(Being being) {
        beings.add(being);
    }

    public void simulateRaceFor(Weather weather) {
        for (Being being : beings) {
            if (being.isAlive()) {
                being.reactToWeather(weather);
                being.checkWater();
                being.checkWaterLimit();
                System.out.println(being);
            }
        }
        //getWinner();
        System.out.println();
    }

    public void getWinner() {
        int bestDistance = 0;
        String winner = "";
        for (Being being : beings) {
            if (bestDistance < being.getDistance()) {
                bestDistance = being.getDistance();
                winner = being.getName();
            }
        }
        System.out.println(
                "The WINNER is: " + winner
                + " with distance: " + bestDistance
        );
    }
}
