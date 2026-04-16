public class EBBill {
    protected String consumerName;
    protected int units;

    public EBBill(String name, int units) {
        this.consumerName = name;
        this.units = units;
    }

    public void displayBaseInfo() {
        System.out.println("Consumer: " + consumerName);
        System.out.println("Units Consumed: " + units);
    }
}
