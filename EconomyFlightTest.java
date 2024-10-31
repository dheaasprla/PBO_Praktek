package com.example.flight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EconomyFlightTest {

    @Test
    public void testEconomyFlightRegularPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger mike = new Passenger("Mike", false);

        assertTrue(economyFlight.addPassenger(mike));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertTrue(economyFlight.removePassenger(mike));
        assertEquals(0, economyFlight.getPassengersList().size());
    }

    @Test
    public void testEconomyFlightVipPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger james = new Passenger("James", true);

        assertTrue(economyFlight.addPassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());

        // Mengizinkan penghapusan penumpang VIP untuk pengujian ini
        assertTrue(economyFlight.removePassenger(james));
        assertEquals(0, economyFlight.getPassengersList().size());
    }
}
