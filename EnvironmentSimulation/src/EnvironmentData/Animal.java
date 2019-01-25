package EnvironmentData;

import java.util.List;

public abstract class Animal {
    boolean isDead;

    public Animal() {
    }

    void live(){
    }

    void eat(){

    }

    void die(List<Animal> currentPopulation){
        currentPopulation.remove(this);
    }

}
