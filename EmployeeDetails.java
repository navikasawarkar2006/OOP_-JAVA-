class EmployeeDetails {
    // Attributes (Object variables)
    String name;
    double salary;

    // Constructor: Using 'this' to assign parameters to object variables
    EmployeeDetails(String name, double salary) {
        this.name = name;      // assigning parameter 'name' to class variable 'this.name'
        this.salary = salary;  // assigning parameter 'salary' to class variable 'this.salary'
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating employee objects
        EmployeeDetails emp1 = new EmployeeDetails("Rahul Kumar", 55000.0);
        EmployeeDetails emp2 = new EmployeeDetails("Sneha Sharma", 62000.0);

        // Displaying the details
        System.out.println("--- Employee Details ---");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
