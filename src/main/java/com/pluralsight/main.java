package com.pluralsight;

public class main {
    public static void main(String[] args) {
        // Test Room

        Room room1 = new Room(2, 150.0, false, false);
        System.out.println("Room available: " + room1.isAvailable());

        // Test Reservation

        Reservation res1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + res1.getReservationTotal());

        // Test Employee

        Employee emp1 = new Employee(101, "Alice Johnson", "Housekeeping", 20.0, 45);
        System.out.println("Employee Total Pay: $" + emp1.getTotalPay());
    }
}
