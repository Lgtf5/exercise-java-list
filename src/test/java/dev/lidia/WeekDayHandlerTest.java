package dev.lidia;

import java.util.Arrays;
import java.util.List;

import javax.print.attribute.DateTimeSyntax;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        @DisplayName ("delete day from the list")
        public void testDeleteDay() {
            List<String> days = Arrays.asList("monday", "tuesday", "wednesday", "thursday",  "saturday","sunday");
            days.remove ("friday");
            assertEquals(6, days.size(), "Are 7 days in the list exactly"); 
            assertFalse(days.contains("friday"));

        }

        @Test
        @DisplayName ("get specific day from the list")
        public void testGetSpecificDay() {
            List<String> days = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday","sunday");
            assertTrue(days.contains ("monday"));
            assertFalse(days.contains("conday"));
        }

        @Test
        @DisplayName ("get specific day from the list if exists")
        public void testGetSpecificDayIfExists() {
            List<String> days = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday","sunday");
            assertTrue(days.contains ("monday"));
            assertFalse(days.contains("MoNday"));
        }

        @Test
        @DisplayName ("get order list in alphabetical order")
        public void testOrderListByAlphabeticalOrder() {
            List<String> days = weekDayHandler.displayCreateList();
            List<String> orderDays = weekDayHandler.orderListByAlphabeticalOrder();

            String[] expectedOrder = {"friday", "monday", "saturday", "sunday", "thursday", "tuesday", "wednesday"};
            assertTrue(Arrays.equals(expectedOrder, orderDays.toArray()), "The list is not in alphabetical order");
        }
        
        @Test
        @DisplayName ("empty list") 
        public void testEmptyList() {
            List<String> days = days.displayCreateList();
            assertEquals(7,days.size());
            days.clear();
            assertTrue(days.isEmpty());
        }
}


