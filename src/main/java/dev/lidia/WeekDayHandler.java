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
    public  int sizeList() {
        return days.size();
    }
    public void deleteDay(String day) {
    days.remove(day);
    }
    public boolean  getSpecificDay(String day) {
        return days.contains ( day);
    }
    public boolean getSpecificDayIfExists(String day) {
        return days.contains(day);
    }
}
