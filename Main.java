
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
        System.out.println();

        // Project 3: Bank Account Management
        System.out.println("--- BANK ACCOUNT MANAGEMENT ---");
        BankAccount account = new SavingsAccount("SAV12345", 5000.0);
        System.out.println("Initial Balance: ₹" + account.getBalance());
        account.deposit(1500.0);
        account.withdraw(2000.0);
        System.out.println("\nTrying to withdraw a large amount...");
        account.withdraw(4000.0);
        
    }
}
