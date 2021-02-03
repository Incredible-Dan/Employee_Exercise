package employee_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



            Employee employee;

            @BeforeEach
            void setUp() {
                employee = new Employee("David","Sam",900);
            }

            @AfterEach
            void tearDown() {
                employee = null;
            }

            @Test

            void testThatEmployeeHasFirstName(){
                employee = new Employee("John", "Sam", 900.00);
                assertEquals("John", employee.getFirstName());
            }
            @Test

            void testThatEmployeeNameCanBeSet(){
                employee = new Employee("John", "Sam", 900.00);

                employee.setFirstName("David");
                assertEquals("David",employee.getFirstName());
            }

            @Test
            void testThatEmployeeLastNameCanBeSet(){
                assertEquals("Sam", employee.getLastName());

            }

            @Test

            void testThatICanGetEmployeeFirstName(){
                //String firstname = employee.getFirstName();

                assertEquals("David",employee.getFirstName());
            }

            @Test

            void testThatICanGetEmployeeLastName(){

                assertEquals("Sam",employee.getLastName());
            }

            @Test
            void testThatEmployeeSalaryCannotBeZero(){
                assertEquals(900, employee.getSalary());

            }

        }

