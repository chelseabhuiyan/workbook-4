package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupiedRoom;
    private boolean dirtyRoom;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupiedRoom =false; //set default to free room
        this.dirtyRoom = false; //set default to clean room
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupiedRoom;
    }

    public boolean isDirty() {
        return dirtyRoom;
    }

    public boolean isAvailable() {
        return !occupiedRoom && !dirtyRoom;
    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room isn't available for check in");
        } else {
            occupiedRoom = true;
            dirtyRoom = true;
            System.out.println("Checked into room");
        }
    }
    public void checkOut() {
        if (!occupiedRoom) {
            System.out.println("Room isn't occupied.");
        } else {
            occupiedRoom = false;
            dirtyRoom = true;
            System.out.println("Checked out. Room needs cleaning.");
        }
    }
    public void cleanRoom() {
        if (!dirtyRoom) {
            System.out.println("Room is already clean.");
        } else {
            dirtyRoom = false;
            System.out.println("Room cleaned.");
        }
    }




}
