package org.example.EnumDay;

public class TypeOfDay {


    public static void typeOfDay (EnumDay day) {
        if (day.isWeekend()) {
            System.out.println(day + " is weekend");
        } else {
            System.out.println(day + " is working day");
        }

    }
}
