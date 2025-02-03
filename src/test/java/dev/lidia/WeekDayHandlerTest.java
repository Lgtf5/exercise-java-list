package dev.lidia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WeekDayHandlerTest {
    private WeekDayHandler weekDayHandler;

    @BeforeEach
    public void setUp() {
        weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();
    }

    @Test
    @DisplayName("método para crear lista")
    public void testCreateList() {

        List<String> days = new ArrayList<>();

        String daysName = weekDayHandler.displayTestCreateList(days);
        assertEquals("monday", daysName);

    }

}
