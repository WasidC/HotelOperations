package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Getters

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Derived getter

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    // exercise 2

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true; // Room becomes dirty once occupied
            System.out.println("Guest checked in successfully.");
        } else {
            System.out.println("Cannot check in: Room is either occupied or dirty.");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true; // Still dirty until cleaned
            System.out.println("Guest checked out. Room is now dirty.");
        } else {
            System.out.println("Cannot check out: Room is already vacant.");
        }
    }

    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room has been cleaned and is now available.");
        } else {
            System.out.println("Room is already clean.");
        }
    }
}