public class Main {
    public static void main(String[] args) {
        // Departments
        Department initialNode = new Department("Minimal Transport Inc."), itDepartment = new Department("IT Department"),
                busDepartment = new Department("Bus Department"),customerSupport = new Department("Customer Support");

        // Employees
        Employee CEO = new Employee("Minerva",1000000), itEngineer = new Employee("John",150000),
                busDriver = new Employee("George",40000),busDriver2 = new Employee("John",55000),
                customerTechnician = new Employee("Sophie",70000);

        // Creating company structure
        initialNode.addComponent(itDepartment);
        initialNode.addComponent(busDepartment);
        initialNode.addComponent(CEO);

        itDepartment.addComponent(itEngineer);
        itDepartment.addComponent(customerSupport);

        customerSupport.addComponent(customerTechnician);

        busDepartment.addComponent(busDriver);
        busDepartment.addComponent(busDriver2);

        // Testing cost calculator
        System.out.println("Total company expenses should be 1,315,000$: " + initialNode.getTotalSalary());
        System.out.println("It department expenses should be 220,000$:" + itDepartment.getTotalSalary());
        System.out.println("Customer support expenses should be 70,000$:" + customerSupport.getTotalSalary());
        System.out.println("Bus driver expenses should be 95,000$: " + busDepartment.getTotalSalary());

        System.out.println();

        // Let's fire a bus driver, clearly that wouldn't hurt the bottom line
        busDepartment.removeComponent(busDriver2);
        System.out.println("Bus driver expenses should be 40,000$: " + busDepartment.getTotalSalary());
        // Quick, re-hire him, our stock markets are plummeting
        busDepartment.addComponent(busDriver2);

        // Printing timeeeeeee
        initialNode.printData();

    }
}
