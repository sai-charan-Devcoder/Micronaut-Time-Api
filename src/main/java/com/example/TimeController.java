package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.text.*;
import java.util.*;

@Controller("/getTime")
public class TimeController{

    @Get("/")
    public String TimesOfDifferentZones() {Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String USA = df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("Australia/Canberra"));
        String Aus = df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("Greenwich"));
        String uk = df.format(today);
        return "Current Time of Different Countries\n\n" + "Indian Timezone(Asia/Kolkata): " + IST + "\n\nUSA Timezone(America/Los_Angeles): " + USA + "\n\nAustralia Timezone(Australia/Canberra): " + Aus + "\n\nUK Timezone(Greenwich): " + uk;
    }
}




