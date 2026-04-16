public class Main {
    public static void main(String[] args) {
        
        // Project 1: Report Card
        System.out.println("--- STUDENT REPORT CARD ---");
        ReportCard r1 = new ReportCard(1001, "Siva", 90, 95, 88);
        r1.calcResult();
        r1.printResult();
        System.out.println(); 

        // Project 2: EB Bill
        System.out.println("--- EB BILLING SYSTEM ---");
        DomesticBill user1 = new DomesticBill("Sivasangari", 150);
        user1.printFinalBill();
    }
}
