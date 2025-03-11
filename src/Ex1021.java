import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();

        int cents = (int) Math.round(value * 100);

        int notes100 = cents / 10000;
        cents %= 10000;
        int notes50 = cents / 5000;
        cents %= 5000;
        int notes20 = cents / 2000;
        cents %= 2000;
        int notes10 = cents / 1000;
        cents %= 1000;
        int notes5 = cents / 500;
        cents %= 500;
        int notes2 = cents / 200;
        cents %= 200;

        int coins1 = cents / 100;
        cents %= 100;
        int coins50 = cents / 50;
        cents %= 50;
        int coins25 = cents / 25;
        cents %= 25;
        int coins10 = cents / 10;
        cents %= 10;
        int coins5 = cents / 5;
        cents %= 5;
        int coins1cent = cents;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", notes100);
        System.out.printf("%d nota(s) de R$ 50.00%n", notes50);
        System.out.printf("%d nota(s) de R$ 20.00%n", notes20);
        System.out.printf("%d nota(s) de R$ 10.00%n", notes10);
        System.out.printf("%d nota(s) de R$ 5.00%n", notes5);
        System.out.printf("%d nota(s) de R$ 2.00%n", notes2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", coins1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", coins50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", coins25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", coins10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", coins5);
        System.out.printf("%d moeda(s) de R$ 0.01%n", coins1cent);

        scan.close();
    }
}