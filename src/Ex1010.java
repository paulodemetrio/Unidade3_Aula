import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int code1 = scan.nextInt();
        int units1 = scan.nextInt();
        double price1 = scan.nextDouble();
        
        int code2 = scan.nextInt();
        int units2 = scan.nextInt();
        double price2 = scan.nextDouble();
        
        double total = (units1 * price1) + (units2 * price2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        scan.close();
    }
}