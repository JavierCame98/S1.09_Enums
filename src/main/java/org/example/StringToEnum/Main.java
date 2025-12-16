package org.example.StringToEnum;

public class Main {

    public static void main(String[] args) {

        Day day1 = StringToEnum.parseDay("Monday");
        System.out.println(day1);
        Day day2 = StringToEnum.parseDay("Thursday");
        System.out.println(day2);
        Day day3 = StringToEnum.parseDay("Weekend");
        System.out.println(day3);
    }
}
