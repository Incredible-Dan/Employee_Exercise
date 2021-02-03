package employee_package;

// (com.Employee.Employee Class) Create a class called com.Employee.Employee that includes three instance variables—a
//first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
//that initializes the three instance variables. Provide a set and a get method for each instance
//variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
//that demonstrates class com.Employee.Employee’s capabilities. Create two com.Employee.Employee objects and display each
//object’s yearly salary. Then give each com.Employee.Employee a 10% raise and display each com.Employee.Employee’s yearly salary
//again.

public class Employee {
    private  String firstName;
    private String lastName;
    private Double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary < 0) {
            System.out.println(" Salary cannot be Negative");
        }
        else
            this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName =firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }
}
