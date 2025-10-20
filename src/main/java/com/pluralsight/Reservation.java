package com.pluralsight;

public class Reservation {
    private String roomType;        // "king" or "double"
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        // Set base price

        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        } else {
            throw new IllegalArgumentException("Invalid room type. Must be 'king' or 'double'.");
        }

        // Apply weekend increase

        if (isWeekend) {
            pricePerNight *= 1.10; // 10% increase
        }
    }

    // Getters and setters

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Derived getter

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}
