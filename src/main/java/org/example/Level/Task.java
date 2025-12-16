package org.example.Level;

public class Task {

    private Level level;

    public Task (Level level){
        this.level = level;
    }

    public void chooseYourLevel(){
        switch (level){
            case LOW -> System.out.println("You choose easy level");
            case MEDIUM ->  System.out.println("You choose normal level");
            case HIGH -> System.out.println("You choose the most difficult mode");
        }
    }
}
