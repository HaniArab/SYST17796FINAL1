

/**
 *
 * @author Hani Arab
 */
public class HourlyEmployee {
    private String name;
    private double wage;
    private double numHours;

    public HourlyEmployee(String name, double wage, double numHours) {
        this.name = name;
        this.wage = wage;
        this.numHours = numHours;
    }

    public double calculatePay() {
        return getNumHours() * getWage();
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getNumHours() {
        return numHours;
    }

    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }

}
