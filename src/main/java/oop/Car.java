package oop;


public class Car {
    // attributes
    private String make;
    private String model;
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    //region  getters and setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return this.speed;
    }
    //endregion

    // no setter for speed
// other methods
    public void accelerate(int changeInSpeed) {
        this.speed += changeInSpeed;
    }

    public void stepOnIt(int minutes) {
        this.speed += 10 * minutes;
    }

    public void slamOnTheBrakes(int seconds) {
        int newSpeed = this.speed -  20 * seconds;
        if (newSpeed < 0) {
            this.speed = 0;
        }
        else {
            this.speed = newSpeed;
        }
    }

    public void brake(int changeInSpeed) {
        if (changeInSpeed > this.speed) {
            this.speed = 0;
        } else {
            this.speed -= changeInSpeed;
        }
    }
}