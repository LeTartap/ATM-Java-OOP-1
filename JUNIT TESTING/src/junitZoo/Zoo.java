package junitZoo;

import java.util.ArrayList;
import java.util.List;
 
public class Zoo {
 
    private List<Animal> animals;
 
    public Zoo() {
        animals = new ArrayList<>();
    }
 
    public boolean addAnimal(final Animal a) {
        return animals.add(a);
    }
 
    public boolean removeAnimal(final Animal a) {
        return animals.remove(a);
    }
 
    public List<Animal> getAnimals() {
        return animals;
    }
 
    public int size() {
        return animals.size();
    }
 
    public boolean areAnimals() {
        return !animals.isEmpty();
    }
 
}