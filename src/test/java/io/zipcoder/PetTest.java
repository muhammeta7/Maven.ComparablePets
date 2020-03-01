package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petSetNameTest(){
        Pet pet = new Pet();
        pet.setName("Pickles");
        Assert.assertEquals("Pickles",pet.getName());
    }

    @Test
    public void petGetNameTest(){
        Pet pet = new Pet();
        pet.setName("Chopper");
        Assert.assertEquals("Chopper",pet.getName());
    }

}
