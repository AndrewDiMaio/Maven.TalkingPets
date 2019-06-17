package io.zipcoder.polymorphism;

public class Dog extends Pet {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String speak(){
        return "Squirrel!";
    }
}
