package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test Room
        Room room = new Room(1, 120.00);
        System.out.println("ROOM");
        System.out.println("Number of beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Is occupied? " + room.isOccupied());
        System.out.println("Is dirty? " + room.isDirty());
        System.out.println("Is available? " + room.isAvailable());
        System.out.println();

        //  Test Reservation
        Reservation reservation = new Reservation("king", 2, true);
        System.out.println("RESERVATION");
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.println("Is weekend? " + reservation.isWeekend());
        System.out.println("Reservation total: $" + reservation.getReservationTotal());
        System.out.println();

        System.out.println("\nChecking in...");
        room.checkIn();  // Room is now occupied and dirty
        System.out.println("Is occupied? " + room.isOccupied());
        System.out.println("Is dirty? " + room.isDirty());
        System.out.println("Is available? " + room.isAvailable());

        System.out.println("\nChecking out...");
        room.checkOut(); // Room is now empty, needs cleaning
        System.out.println("Is occupied? " + room.isOccupied());
        System.out.println("Is dirty? " + room.isDirty());
        System.out.println("Is available? " + room.isAvailable());

        room.cleanRoom(); // Clean the room for future check-ins
        System.out.println("Room cleaned. Is dirty? " + room.isDirty());
        System.out.println();

        // Test Employee
        Employee employee = new Employee("Laila Daisy", "C123", "Front Desk", 18.00, 45);
        System.out.println("EMPLOYEE");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Pay rate: $" + employee.getPayRate());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: $" + employee.getTotalPay());


        // Test Punch-in and Punch-out
        System.out.println("\nPunching in and out...");
        employee.punchIn(9.0);  // Punch in at 9:00 AM
        employee.punchOut(13.0); // Punch out at 1:00 PM
        System.out.println("Total hours worked: " + employee.getHoursWorked());
        System.out.println("Total pay after punch in/out: $" + employee.getTotalPay());


    }

    /**

        public static void testEmployee(){

            Employee e1 = new Employee(1, "Matt", "Facilitators", 10);

            e1.setHoursWorked(39);

            System.out.println(e1.getTotalPay());

            Employee e2 = new Employee(1, "Matt", "Facilitators", 10);
            e2.setHoursWorked(40);
            System.out.println(e2.getTotalPay());

            Employee e3 = new Employee(1, "Matt", "Facilitators", 10);
            e3.setHoursWorked(41);
            System.out.println(e3.getTotalPay());



        }

        public static void testReservation1() {
            Reservation r1 = new Reservation("king", false, 1);
            System.out.println(r1.getPrice());

            Reservation r2 = new Reservation("double", false, 1);
            System.out.println(r2.getPrice());

            Reservation r3 = new Reservation("king", true, 1);
            System.out.println(r3.getPrice());

            Reservation r4 = new Reservation("double", true, 1);
            System.out.println(r4.getPrice());

        }
     }
     **/

}