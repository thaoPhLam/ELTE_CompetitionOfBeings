package com.codecool.thao.competition.app;

import com.codecool.thao.competition.beings.Sand;
import com.codecool.thao.competition.beings.Sponge;
import com.codecool.thao.competition.beings.Walker;
import com.codecool.thao.competition.Competition;
import com.codecool.thao.competition.Weather;

public class Main {
    public static void main(String[] args) {
        Competition competition = new Competition();

        competition.registerContestant(new Sand(4, "Vandor"));
        competition.registerContestant(new Walker(7, "Seta"));
        competition.registerContestant(new Sponge(12, "Csuszo"));
        competition.registerContestant(new Sponge(10, "Siklo"));

        competition.simulateRaceFor(Weather.SUNNY);
        competition.simulateRaceFor(Weather.CLOUDY);
        competition.simulateRaceFor(Weather.CLOUDY);
        competition.simulateRaceFor(Weather.RAINY);
        competition.simulateRaceFor(Weather.RAINY);
        competition.simulateRaceFor(Weather.RAINY);
        competition.simulateRaceFor(Weather.SUNNY);
        competition.simulateRaceFor(Weather.SUNNY);
        competition.simulateRaceFor(Weather.CLOUDY);

        competition.getWinner();

    }
}
