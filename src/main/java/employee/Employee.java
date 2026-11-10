package employee;

import java.time.LocalTime;

public class Employee {
    private String name;
    private int hoursWorked;
    private int startTime;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public void punchIn(int hour) {
        System.out.println("hey, " + this.name + "punched in at: " + hour);
        this.startTime = hour;
    }

    public void punchIn() {
        LocalTime rightNow = LocalTime.now();
        int hour = rightNow.getHour();

    }

    public void punchOut() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void punchOut(int outTime) {
        int hoursToday = outTime - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursToday;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

}
