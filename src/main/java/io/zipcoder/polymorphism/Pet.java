package io.zipcoder.polymorphism;
import java.lang.Comparable;

public class Pet {
    private String speak;
    public String name;

    public Pet(String name) {
        this.name = name;
    }

public void setName(String expected){
    this.name = name;
}

public String getName(){
    return this.name;
}

public String speak(){
    return "Hello";
}


}

