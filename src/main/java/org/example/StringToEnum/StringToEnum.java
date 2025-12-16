package org.example.StringToEnum;

public class StringToEnum {

    public static Day parseDay(String input) {
        try {
            return Day.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level: " + input);
            return null;
        }
    }
}
