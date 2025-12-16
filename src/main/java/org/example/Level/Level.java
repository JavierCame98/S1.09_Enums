package org.example.Level;

public enum Level {

    LOW("Green"),
    MEDIUM("Orange"),
    HIGH("Red");

    private final String color;

    Level(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
