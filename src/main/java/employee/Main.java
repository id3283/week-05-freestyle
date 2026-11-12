package employee;

public class Main {

    public static void main(String[] args) {
        Employee dave;
        dave = new Employee("Dave");


        System.out.println(dave.name);

        dave.punchIn();
        dave.punchOut(22);

        dave.punchIn(14);
        dave.punchOut();

        if(dave.getHoursWorked() == 8) {
            System.out.println("Test passed 🎉");
        }
        else {
            System.out.println("Test failed! 💩");
        }

        System.out.println("Worked total of: " + dave.getHoursWorked());
    }
}
