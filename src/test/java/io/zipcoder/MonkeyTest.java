package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MonkeyTest {
    @Test
    public void MonkeyConstructorTest(){
        Monkey monkey = new Monkey("Max");
        Assert.assertEquals("Max", monkey.getName());
    }

    @Test
    public void MonkeySpeakTest(){
        Monkey monkey = new Monkey("Max");
        monkey.speak();
    }
}
