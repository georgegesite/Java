public class App {
    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[3];

        // Initialize Employee objects and add them to the array
        employees[0] = new Employee("Alice", 1001);
        employees[1] = new Employee("Bob", 1002);
        employees[2] = new Employee("Charlie", 1003);

        // Display information of all employees
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
