

/**
 *
 * @author Hani Arab
 */
public class Main {
    
    public static void main(String[] args) {
        HourlyEmployee e = new HourlyEmployee("Majd", 150, 40);
        HourlyPlusCommissionEmployee m = new HourlyPlusCommissionEmployee("Hani", 250, 40, 1500);

        System.out.println(e + " has a paycheck of " + e.calculatePay());
        System.out.println(m + " has a paycheck of " + m.calculatePay());
    }


}
