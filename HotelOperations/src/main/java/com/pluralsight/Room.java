package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupiedRoom;
    private boolean dirtyRoom;
    private boolean availableRoom;

    public Room(int numberOfBeds, double price, boolean occupiedRoom, boolean dirtyRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupiedRoom = occupiedRoom;
        this.dirtyRoom = dirtyRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied(){
        return occupiedRoom;
    }

    public boolean isDirty(){
        return dirtyRoom;
    }

    public boolean isAvailable(){
        return !occupiedRoom && !dirtyRoom;
    }
}
