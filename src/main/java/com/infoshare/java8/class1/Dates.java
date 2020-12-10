package com.infoshare.java8.class1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {

        LocalDate demandTime = LocalDate.of(2018, Month.MARCH, 13);

        LocalDate insertedDate = LocalDate.parse("2020-12-30"); //We can create custom date formatter
        //Custom formatter
        DateTimeFormatter customFormat =  DateTimeFormatter.ofPattern("y.M.d");
        LocalDate dateWithCustomFormat = LocalDate.parse("2020.12.31", customFormat);

        System.out.println(dateWithCustomFormat.format(customFormat)); //Display date with custom format
        System.out.println(demandTime.format(customFormat));


        System.out.println(demandTime.getYear());
        System.out.println(demandTime.getMonth());
        System.out.println(demandTime.getDayOfWeek());

        System.out.println(demandTime);
        System.out.println(insertedDate);

        System.out.println(dateWithCustomFormat);

        System.out.println("----------------------------------");

        //Time tasks
        LocalTime customTime = LocalTime.of(7, 15, 0);

        DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
//        LocalTime timeFromString = LocalTime.parse("08:00:00", customTimeFormat);

        System.out.println(customTime.getHour());
        System.out.println(customTime.getMinute());
        System.out.println(customTime.getSecond());

        System.out.println(customTime.toString());

    }
}
