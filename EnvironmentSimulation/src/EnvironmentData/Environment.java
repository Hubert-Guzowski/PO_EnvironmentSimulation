package EnvironmentData;

import EnvironmentData.Species;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Environment {
    public static List<Species> allOfTheSpecies = new LinkedList<>();
    private int vegetation;
    private Season currentSeason;

    public void environmentSetup(int numberOfCarnivores, int numberOfHerbivores){

        Species firstCarnivores = new Species ("00FF00", numberOfCarnivores);
        for (int i = 0; i < numberOfCarnivores; i++) {
            firstCarnivores.currentPopulation.add(new Carnivore());
        }
        allOfTheSpecies.add(firstCarnivores);

        Species firstHerbivores = new Species ("00FF00", numberOfHerbivores);
        for (int i = 0; i < numberOfHerbivores; i++) {
            firstHerbivores.currentPopulation.add(new Herbivore());
        }
        allOfTheSpecies.add(firstHerbivores);

    }

    public void symulateOneSeasonTick(){
        for (Species species : allOfTheSpecies) {
            species.symulate();
        }
            vegetation = vegetation + currentSeason.vegetationLevel;
            currentSeason = currentSeason.nextSeason;
    }
}
