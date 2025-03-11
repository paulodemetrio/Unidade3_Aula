import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();

        int time = distance * 2;

        System.out.println(time + " minutos");

        scan.close();
    }
}