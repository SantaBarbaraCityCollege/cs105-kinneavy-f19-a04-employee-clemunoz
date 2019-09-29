/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Clemente Munoz
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
    // TODO: Paste code in here from the sample usage section. Feel free to adjust things like the salary and percent raised
    Employee harry = new Employee("Harry", 10000);
    harry.raiseSalary(10); // Harry gets a 10% raise.
    double harrysSalary = harry.getSalary();
    System.out.printf("Name: %s , Salary: %f",harry.getName(),harry.getSalary());
    
    
    }
}