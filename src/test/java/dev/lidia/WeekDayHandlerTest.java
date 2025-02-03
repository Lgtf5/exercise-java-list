package dev.lidia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


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

        List<String> days = weekDayHandler.displayCreateList();
        assertFalse(days.isEmpty(), "the list isn't empty");
        assertEquals("monday", days.get(0), "The first day should be Monday");
        assertEquals("sunday", days.get(6), "the last day should be sunday");
        assertEquals(7, days.size(), "Are 7 days in the list exactly");
        }
    }

