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
    @DisplayName("create list method")
    public void testCreateList() {

        List<String> days = weekDayHandler.displayCreateList();
        assertFalse(days.isEmpty(), "the list isn't empty");
        assertEquals("monday", days.get(0), "The first day should be Monday");
        assertEquals("sunday", days.get(6), "the last day should be sunday");
        assertEquals(7, days.size(), "Are 7 days in the list exactly");
        }
        
            

        @Test
        @DisplayName ("size list return method")
        public void testSizeList() {
            List<String> days = weekDayHandler.displayCreateList();
            assertEquals(7, days.size(), "Are 7 days in the list exactly");
        }

        @Test
        void testDeleteDay() {
            days.deleteDay("friday");
            assertEquals(6, days.size());
            assertFalse(days.existDay("friday"));

        }
        
    }
    

