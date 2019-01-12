package junitZoo;

public class Animal {
	 
    private String species;
    private String name;
 
    public Animal() {
        this("unknown", "unknown");
    }
 
    public Animal(final String newSpecies, final String newName) {
        this.species = newSpecies;
        this.name = newName;
    }
 
    public String getSpecies() {
        return species;
    }
 
    public void setSpecies(final String newSpecies) {
        this.species = newSpecies;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(final String newName) {
        this.name = newName;
    }
 
    @Override
    public boolean equals(final Object o) {
        if (null == o) {
            return false;
        }
 
        if (this == o) {
            return true;
        }
 
        if (!(o instanceof Animal)) {
            return false;
        }
 
        Animal other = (Animal) o;
 
        return this.species.equals(other.species) && this.name.equals(other.name);
    }
 
}