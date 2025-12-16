package org.example.Level;

public class Main {
    public static void main(String[] args) {

        Task lowTask = new Task(Level.LOW);
        Task mediumTask = new Task(Level.MEDIUM);
        Task highTask = new Task(Level.HIGH);

        lowTask.chooseYourLevel();
        mediumTask.chooseYourLevel();
        highTask.chooseYourLevel();
        System.out.println(Level.LOW.getColor());


    }
}
