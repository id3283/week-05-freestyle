package hotel;

import employee.Employee;

public class HotelMain {


    public static void main(String[] args) {
        Room room10 = new Room(10);
        Room room11 = new Room(11);

        room10.display();
        room11.display();

        System.out.println("checking into room 10");
        room10.checkIn();

        room10.display();
        room11.display();
    }
}
