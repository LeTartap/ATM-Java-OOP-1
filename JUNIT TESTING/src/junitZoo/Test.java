package junitZoo;

import org.junit.Assert;

public class Test {
	@org.junit.Test
	public void testAddAnimal() {
		Zoo myZoo = new Zoo();	
		Animal myAnimal = new Animal("Dog", "Bob");
		myZoo.addAnimal(myAnimal);
		Assert.assertTrue(myZoo.getAnimals().contains(myAnimal));
	}
	@org.junit.Test
	public void testRemoveAnimal() {
		Zoo myZoo = new Zoo();	
		Animal myAnimal = new Animal("Dog", "Bob");
		myZoo.addAnimal(myAnimal);
		Assert.assertTrue(myZoo.getAnimals().contains(myAnimal));
		myZoo.removeAnimal(myAnimal);
		Assert.assertFalse(myZoo.getAnimals().contains(myAnimal));
	}
	
	@org.junit.Test
	public void testAnimalsInZoo() {
		Zoo myZoo = new Zoo();
		Animal myAnimal = new Animal("Dog", "Bob");
		myZoo.addAnimal(myAnimal);
        Assert.assertFalse(myZoo.getAnimals().isEmpty());
	}
	@org.junit.Test
	public void testGetAnimals() {
		Zoo myZoo = new Zoo();	
		Assert.assertTrue(myZoo.getAnimals().isEmpty());
		Animal myAnimal = new Animal("Dog", "Bob");
		Animal myAnimal1 = new Animal("Dromader", "Camelia");
		myZoo.addAnimal(myAnimal);
		Assert.assertTrue(myZoo.getAnimals().contains(myAnimal));
		myZoo.addAnimal(myAnimal1);
		Assert.assertTrue(myZoo.getAnimals().contains(myAnimal1));	
		}
}
