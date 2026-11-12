package employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testPunchIn_for_positive_hour_less_than_24() {
        // arrange
        Employee suliman = new Employee("Suliman");

        // act
        suliman.punchIn(8);

        // assert
        int expected = 8;
        Assertions.assertEquals(expected, suliman.startTime);
    }

    @Test
    void punchOut() {
        // arrange
        Employee suliman = new Employee("Suliman");
        suliman.punchIn(8);

        // act
        suliman.punchOut(14);

        // assert
        Assertions.assertEquals(6, suliman.hoursWorked);
    }
}