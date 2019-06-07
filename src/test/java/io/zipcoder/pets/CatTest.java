package io.zipcoder.pets;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void catSpeakTest{
        Cat cat = new Cat(null);
        String expected = "You may feed me now.";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void catGetNameTest{
        String expected = "Snowball"
        Cat cat = new Cat(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void catSetNameTest{
        Cat cat = new Cat(null);
        String expected = "Snowball";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

}