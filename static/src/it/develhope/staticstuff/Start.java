package it.develhope.staticstuff;

/**
 * Tester class with main method.
 *
 * @author TonyF
 */
public class Start{
    public static void main(String[] args){

        // create two new Employees
        Employee carlo  = new Employee("Carlo","Rossi","Via lambretta 12");
        Employee giulia = new Employee("Giulia","Veneselli","Via CarloV 10");
        // create their new 2 Badges;
        Badge carloBadge  = new Badge(carlo);
        Badge giuliaBadge = new Badge(giulia);
        // show to the user the 2 employees' badge details
        carloBadge.showBadgeDetails();
        giuliaBadge.showBadgeDetails();
    }
}
