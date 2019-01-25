package EnvironmentData;

import java.util.List;

public class Herbivore extends Animal {

    public Herbivore() {
        super();
    }

    void live(int amountOfVegetation, List<Animal> currentPopulation){

    }

    void eat(int amountOfVegetation){
        if(amountOfVegetation > 0){
            amountOfVegetation -= 1;
        }
    }

    void reproduce(List<Animal> currentPopulation){
        for(int i =0; i<5; i++)
        currentPopulation.add(new Herbivore());
    }

    void die(List<Animal> currentPopulation){
        if(this.isDead)
            currentPopulation.remove(this);
    }

}
