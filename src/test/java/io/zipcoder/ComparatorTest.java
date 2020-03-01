package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

    @Test
    public void petSort1Test(){
        ArrayList<Pet> pets = new ArrayList<>();

        Pet dog = new Dog("Coop");
        Pet cat = new Cat("Mittens");
        Pet monkey = new Monkey("Wally");

        pets.add(dog);
        pets.add(cat);
        pets.add(monkey);
        pets.add(new Dog("Joe"));
        pets.add(new Cat("Apple"));
        pets.add(new Monkey("Nanners"));

        Collections.sort(pets);
        for (Pet p : pets) {
            System.out.println(p.getName()+ " the "+ p.getClass().getSimpleName());
        }

        Assert.assertTrue( pets.indexOf(dog) < pets.indexOf(cat) );
    }


    @Test
    public void petComparatorTest(){
        ArrayList<Pet> newPets = new ArrayList<>();

        Pet dog = new Dog("Coop");
        Pet cat = new Cat("Mittens");
        Pet monkey = new Monkey("Wally");
        Pet dog1 = new Dog("Mimi");
        Pet cat1 = new Cat("Fifi");

        newPets.add(dog);
        newPets.add(cat);
        newPets.add(monkey);
        newPets.add(new Dog("Joe"));
        newPets.add(new Cat("Apple"));
        newPets.add(new Monkey("Nanners"));

        PetComparator compare = new PetComparator();
        newPets.sort(compare);

        for (Pet p : newPets) {
            //p.speak();
            System.out.println(p.getClass().getSimpleName()+"'s name is "+ p.getName());
        }
        Assert.assertTrue( newPets.indexOf(dog) > newPets.indexOf(dog1) );
        Assert.assertTrue( newPets.indexOf(cat) > newPets.indexOf(cat1) );
    }

}
