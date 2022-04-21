

/**
 *
 * @author Hani Arab
 */
public class HourlyPlusCommissionEmployee extends  HourlyEmployee {
    private double commission;

    public HourlyPlusCommissionEmployee (String name, double wage, double numHours, double commission) {
        super(name, wage, numHours);
        this.commission = commission;
    }

    @Override
    public double calculatePay() {
        return getWage() * getNumHours() + getCommission();
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this. commission = commission;
    }

}
