import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        
        double weightA = 3.5;
        double weightB = 7.5;
        double average = (A * weightA + B * weightB) / (weightA + weightB);
        
        System.out.printf("MEDIA = %.5f%n", average);
        
        scan.close();
    }
}