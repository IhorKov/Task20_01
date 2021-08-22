package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTimeStart = LocalDateTime.of(2021, Month.AUGUST,16, 20, 00);
        LocalDateTime localDateTimeFinish = LocalDateTime.of(2021, Month.AUGUST, 21, 16, 00);

        Duration duration = Duration.between(localDateTimeStart, localDateTimeFinish);

        System.out.println(duration.toDays() + " дней");
        System.out.println(duration.toHours() + " часов");
        System.out.println(duration.toMinutes() + " минут");
        System.out.println(duration.toSeconds() + " секунд");
    }
}
