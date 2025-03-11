import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        double fixedSalary = scan.nextDouble();
        double totalSales = scan.nextDouble();
        
        double finalSalary = fixedSalary + (totalSales * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
        
        scan.close();
    }
}