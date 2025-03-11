import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();

        int n100 = (value / 100);
        int n50 = (value % 100) / 50;  
        int n20 = ((value % 100) % 50) / 20;
        int n10 = (((value % 100) % 50) % 20) / 10;
        int n5 = ((((value % 100) % 50) % 20) % 10) / 5;
        int n2 = (((((value % 100) % 50) % 20) % 10) % 5) / 2;
        int n1 = ((((((value % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        
        System.out.println(value);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

        scan.close();
    }
}