package com.tim;

public class Bottle {
    private int id;
    private String name;
    private int fillLevel;

    public Bottle(){}
    public Bottle(String name, int fillLevel)
    {
        this.name = name;
        this.fillLevel = fillLevel;
    }


    //GETTER & SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public void setFillLevel(int fillLevel) {
        this.fillLevel = fillLevel;
    }
}
