package javaprogrammingmasterclass.exercises;

public class DurationToString {
     public static String getDurationToString(int min, int sec) {
        if (min < 0 || sec < 0) {
            return "Invalid Value";
        }

        //XXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.

        else {
            int minFromSec = sec / 60;

            int hour = (min + minFromSec) / 60;

            int remMin = (min + minFromSec) % 60;

            return hour + "h " + remMin + "m " + sec % 60 + "s";
        }


    }


    }
