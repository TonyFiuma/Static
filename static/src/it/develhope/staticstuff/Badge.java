package it.develhope.staticstuff;

/**
 * Class that represents an office badge
 *
 * @author TonyF
 */
public class Badge{

    private static int totalNumberOfEmployees; // private static variable (property shared across different objects)
    private final String badgeIdCode;                // each employee's personal badge id code
    public final Employee employee;                  // each badge is associated to an Employee

    /**
     * Badge's constructor method
     *
     * @param employeeThatNeedsBadge it's the Employee object that will need to be associated to the Badge
     */
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

    /**
     * Static method that creates the badge number just by adding 1 to the static badgeNumber
     */
    public static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;// use the summation operator to add 1 to the badgeNumber
        System.out.println(totalNumberOfEmployees);
    }

    /**
     * Method that generates the identifier for each Badge
     *
     * @return a String containing name and surname of the employee between two codes
     */
    private String generateBadgeIdCode(){
        return "The hash of the badge: XYZ"+employee.getName()+employee.getSurname()+"ZYX";
    }

    /**
     * Method that prints all the employee details and the relative badgeNumber
     */
    public void showBadgeDetails(){
        System.out.println("Number of employee:"+totalNumberOfEmployees+" "+employee.getEmployeeDetails()+
                                   " "+badgeIdCode);
    }


}
