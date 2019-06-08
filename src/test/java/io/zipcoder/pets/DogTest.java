package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Name of Dog";
        Dog dog = new Dog(expectedName);

        // When
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void dogSpeakTest{
        Dog dog = new Dog(null);
        String expected = "Squirrel!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void dogGetNameTest{
        String expected = "Fido"
        Dog dog = new Dog(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void dogSetNameTest{
        Dog dog = new Dog(null);
        String expected = "Fido";
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

}