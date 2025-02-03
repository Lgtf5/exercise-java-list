package dev.lidia;

import java.util.ArrayList;
import java.util.List;

public class WeekDayHandler {

    private List<String> days;

    public WeekDayHandler() {
        this.days = new ArrayList<String>();
    }

    public void createList() {

        days.clear();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        days.add("sunday");

    }

    public ArrayList<String> displayCreateList() {
        return new ArrayList<>(days);
    }

}
