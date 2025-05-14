package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RoomTest {

    @Test
    public void checkIn_after_occupancyShouldBeTrue() {
        Room r = new Room(1, 150);
        r.checkIn();
        assertTrue(r.isOccupied());
    }

    @Test
    public void checkIn_after_dirtyShouldBeTrue() {
        Room r = new Room(1, 150);
        r.checkIn();
        assertTrue(r.isDirty());
    }

    @Test
    public void checkIn_after_availableShouldBeFalse() {
        Room r = new Room(1, 150);
        r.checkIn();
        assertFalse(r.isAvailable());
    }

    @Test
    public void checkOut_after_occupiedShouldBeFalse() {
        Room r = new Room(1, 150);
        r.checkIn();
        r.checkOut();
        assertFalse(r.isOccupied());
    }

    @Test
    public void checkOut_after_dirtyShouldBeTrue() {
        Room r = new Room(1, 150);
        r.checkIn();
        r.checkOut();
        assertTrue(r.isDirty());
    }

    @Test
    public void checkOut_after_availableShouldBeFalse() {
        Room r = new Room(1, 150);
        r.checkIn();
        r.checkOut();
        assertFalse(r.isAvailable());
    }

    @Test
    public void cleanRoom_after_checkOutShouldBeFalseOccupied() {
        Room r = new Room(1, 150);
        r.checkIn();
        r.checkOut();      // end occupancy
        r.cleanRoom();     // clean the room
        assertFalse(r.isOccupied());
    }


    @Test
    public void cleanRoom_after_dirtyShouldBeFalse() {
        Room r = new Room(1, 150);
        r.checkIn();
        r.cleanRoom();
        assertFalse(r.isDirty());
    }

    @Test
    public void cleanRoom_after_checkOutShouldBeAvailable() {
        Room r = new Room(1, 150);
        r.checkIn();     // occupied = true, dirty = true
        r.checkOut();    // occupied = false, dirty = true
        r.cleanRoom();   // dirty = false
        assertTrue(r.isAvailable()); //  available = true (not occupied, not dirty)
    }

}
