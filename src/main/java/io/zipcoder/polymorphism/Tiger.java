package io.zipcoder.polymorphism;

public class Tiger extends Pet  {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String speak(){
        return "Rawr!";
    }
    }

