public class EmployeeClient {
    public static void main(String[] args) {
        Address address = new Address();
        Employee employee = new Employee(address);
        //Employee e1 = new Employee("MAMTA", "Developer", address.setCity("Chennai);
        // );
        System.out.println(employee.address.city);
    }
}
