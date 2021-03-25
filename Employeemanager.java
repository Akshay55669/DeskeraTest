import java.util.Collection;

public class EmployeesManager {

  /**
   * Implement EmployeesManager to manage all employees of a company
   *
   */

  /**
   * Adds an Employee
   *
   * ArrayList employeeNameList = new ArrayList();
  employeeNameList.add("John");
  employeeNameList.add("Ankit");
  employeeNameList.add("Rohan");
  employeeNameList.add("Amit");
   * @param employee
   * @return
   */
   
   public static void main(String [] args)
   {
       try (Scanner sc = new Scanner(System.in)) {
			// create suitable DS to store account details : HashMap

			Map<Integer, Employee> emps = populateMap(populateList());
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("Menu 1.Add new Employee 2.find employee by id 3. employee older than x yrs \n"
							+ "4. Delete Employee 5.list of all current employees \n" + "100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt())
					{
					    
					case 1:
                               // Employee emp=new Employee();
                            System.out.println("Enter emp  details : employee fullname Birth Date ");
						    Employee emp = new Employee(sc.next(),sc.next());
						    ArrayList emplist=new ArrayList();
                            emplist.addEmployee(emp);
						    break;
                                
                                
					}
      
      
   }
   
  String addEmployee(Employee employee) {
    // TODO - implement this
    
    
    
    
    return null;
  }

  /**
   * Finds an Employee
   *
   * @param employeeId
   * @return
   */
  Employee findEmployee(String employeeId) {
    // TODO - implement this
    return null;
  }

  /**
   * Find all Employee who are older than X years
   * @param years
   * @return
   */
  Collection<Employee> findEmployee(int years) {
      
    return null;
  }

  /**
   * Removes an employee
   *
   * @param employeeId
   * @return
   */
  boolean removeEmployee(String employeeId) {
    // TODO - implement this
    return false;
  }

  /**
   * Lists all Employees
   *
   * @return
   */
  Collection<Employee> listEmployees() {
    // TODO - implement this
    return null;
  }
}

class Employee {

  private int ageInYears;
  private int ageInMonths;
  private String birthDate;
  private String firstName;
  private String lastName;

  private String employeeId;

  public Employee(String fullName, String birthDate) {
    // TODO - implement this
    this.firstName=fullName;
    this.lastName=fullName;
    this.birthDate=birthDate;
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public int getAgeInMonths() {
    return ageInMonths;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getBirthDate() {
    return birthDate;
  }
}