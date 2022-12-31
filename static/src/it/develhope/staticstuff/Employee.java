package it.develhope.staticstuff;

/**
 * Class that represents an office employee
 * @author TonyF
 */
public class Employee {
private String name;
private String surname;
private String address;

    /**
     * Employee's constructor method
     * @param newEmployeeName String name of the new employee
     * @param newEmployeeSurname String surname of the new employee
     * @param newEmployeeAddress String address of the new employee
     */
	 public Employee(String newEmployeeName,String newEmployeeSurname,String newEmployeeAddress){
         this.name = newEmployeeName;
         this.surname = newEmployeeSurname;
         this.address = newEmployeeAddress;
     }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Get all the details regarding an employee
     * @return a String with the employee's name, surname and address
     */
    public String getEmployeeDetails(){
        return name + " " + surname +" " + address;
    }
}
