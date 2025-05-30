package dev.lidia;

import java.util.ArrayList;
import java.util.List;

public class WeekDayHandler {
    private final List<String> days;
    public WeekDayHandler() {
        this.days = new ArrayList<>();
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

    public List<String> displayCreateList() {
        return new ArrayList<>(days);
    }
    public  int sizeList() {
        return days.size();
    }
    public boolean deleteDay(String day) {
        return days.remove(day);
    }
    public boolean  getSpecificDay(String day) {
        return days.contains(day);
    }
    public boolean getSpecificDayIfExists(String day) {
        return days.stream().anyMatch(d -> d.equalsIgnoreCase(day));
    }
    public List<String> orderListByAlphabeticalOrder() {
        List<String> orderDays = new ArrayList<>(days);
        orderDays.sort(String.CASE_INSENSITIVE_ORDER);
        return orderDays;
    }
    public void emptyList() {
        days.clear();
    }
}
