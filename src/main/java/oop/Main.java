package oop;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Mustang", "GT");

        System.out.println("Starting speed: " + car.getSpeed());

        System.out.println("Okay, step on it for 5 minutes, let's go!!!");
        car.stepOnIt(5);


        System.out.println("3 minutes later... speed is now: " + car.getSpeed());

        System.out.println("Stand on the brakes for 2 seconds!");
        car.slamOnTheBrakes(2);

        System.out.println(car.getSpeed());
//////////////////////////////////////////

        Car truck = new Car("Ford", "Explorer");
        System.out.println("Starting speed: " + truck.getSpeed());

        System.out.println("Okay, step on it for 5 minutes, let's go!!!");
        truck.stepOnIt(5);
//        int currentSpeed = truck.getSpeed();
//        currentSpeed += 5 * 10;
//        truck.setSpeed(currentSpeed);

    }
}
