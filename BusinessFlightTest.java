package com.example.flight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BusinessFlightTest {

    @Test
    public void testBusinessFlightRegularPassenger() {
        Flight businessFlight = new BusinessFlight("2");
        Passenger mike = new Passenger("Mike", false);

        assertFalse(businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertFalse(businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightVipPassenger() {
        Flight businessFlight = new BusinessFlight("2");
        Passenger james = new Passenger("James", true);

        assertTrue(businessFlight.addPassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertFalse(businessFlight.removePassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
    }
}
