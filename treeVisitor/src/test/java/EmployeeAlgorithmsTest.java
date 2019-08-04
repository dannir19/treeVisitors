import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeAlgorithmsTest {

    @Test
    public void counterAlgorithm() {
        StatisticsService statisticsService = new StatisticsService();

        Employee employee = new Manager(3,
                        new Manager(5,
                                new RegularEmployee(1),
                                new RegularEmployee(3)),
                        new RegularEmployee(2));
        assertEquals(3, statisticsService.regularEmployeeCount(employee));
    }
}