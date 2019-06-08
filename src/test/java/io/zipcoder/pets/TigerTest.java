package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class TigerTest {

    @Test
    public void testInheritance() {
        Pet p = new Tiger();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Name of Tiger";
        Tiger tiger = new Tiger(expectedName);

        // When
        String actualName = tiger.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void tigerSpeakTest(){
        String expected = "Rawr!";
        Tiger tiger = new Tiger(null);
        String actual = tiger.speak();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void tigerGetNameTest{
        String expected = "Hobbes"
        Tiger tiger = new Tiger(expected);
        String actual = tiger.getName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void tigerSetNameTest{
        Tiger tiger = new Tiger(null);
        String expected = "Hobbes";
        tiger.setName(expected);
        String actual = tiger.getName();
        Assert.assertEquals(expected,actual);
    }

}