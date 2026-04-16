public class DomesticBill extends EBBill {
    public DomesticBill(String name, int units) {
        super(name, units);
    }
    public double calculateBill() {
        double amount = 0;
        if (units <= 100) amount = 0;
        else if (units <= 200) amount = (units - 100) * 1.5;
        else amount = (100 * 1.5) + (units - 200) * 3.0;
        return amount;
    }
    public void printFinalBill() {
        displayBaseInfo();
        System.out.println("Total Amount: ₹" + calculateBill());
    }
}
