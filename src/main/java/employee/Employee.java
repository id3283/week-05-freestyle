package employee;

import java.time.LocalTime;

public class Employee {
    String name;
    int hoursWorked;
    int startTime;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public void punchIn(int hour) {
        System.out.println("Hey, " + this.name + "punched in at: " + hour);
        this.startTime = hour;
    }

    public void punchIn() {
        LocalTime rightNow = LocalTime.now();
        int hour = rightNow.getHour();

        this.startTime = hour;
    }

    public void punchOut() {
        LocalTime rightNow = LocalTime.now();
        int outTime = rightNow.getHour();

        int hoursToday = outTime - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursToday;
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
