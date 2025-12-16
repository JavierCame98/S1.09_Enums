package org.example.EnumDay;

public enum EnumDay {
    MONDAY,
    THURSDAY,
    WEDNESDAY,
    TUESDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend(){
       return this == SATURDAY || this == SUNDAY;
    }

}
