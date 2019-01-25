package EnvironmentData;

import java.util.LinkedList;
import java.util.List;

public class Species {
    List<Animal> currentPopulation;
    public int speciesID;
    private String color;
    public int numberOfAnimals;
    public int tickOfExtinction;

    public Species(String color, int numberOfAnimals){
        List<Attribute> currentPopulation = new LinkedList<>();
        this.color = color;
        this.numberOfAnimals = numberOfAnimals;

    }

    public void symulate(){
        for (Animal animal: currentPopulation){
            animal.live();
        }
    }

    public String getColor(){
        return color;
    }

}
