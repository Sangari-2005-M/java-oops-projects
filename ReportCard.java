public class ReportCard {
    private int rollno;
    private String name;
    private int m1, m2, m3;
    private int total;
    private float avg;

    public ReportCard(int rollno, String name, int m1, int m2, int m3) {
        this.rollno = rollno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void calcResult() {
        total = m1 + m2 + m3;
        avg = (float) total / 3;
    }

    public void printResult() {
        System.out.println("Roll No: " + rollno + " | Name: " + name + " | Average: " + avg);
    }
}
