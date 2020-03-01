package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void DogConstructorTest(){
        Dog dog = new Dog("Max");
        Assert.assertEquals("Max", dog.getName());
    }

    @Test
    public void DogSpeakTest(){
        Dog dog = new Dog("Max");
        dog.speak();
    }
}
