package io.zipcoder.polymorphism;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }


    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String speak(){
        return "You may feed me now.";
    }
}
