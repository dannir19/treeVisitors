public class StatisticsService {

    public int regularEmployeeCount(Employee employee) {
        CounterVisitor counterVisitor = new CounterVisitor();
        employee.accept(counterVisitor);
        return counterVisitor.getCounter();
    }
}
