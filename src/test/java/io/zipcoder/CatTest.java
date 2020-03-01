package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void CatConstructorTest(){
        Cat cat = new Cat("Max");
        Assert.assertEquals("Max", cat.getName());
    }

    @Test
    public void CatSpeakTest(){
        Cat cat = new Cat("Max");
        cat.speak();
    }
}
