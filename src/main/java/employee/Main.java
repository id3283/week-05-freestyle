package employee;

public class Main {

    public static void main(String[] args) {
        Employee firdavs = new Employee("Firdavs");

        firdavs.punchIn();
        firdavs.punchOut(18);

        firdavs.punchIn(5);
        firdavs.punchOut();


        System.out.println("Worked total of: " + firdavs.getHoursWorked());

    }
}
