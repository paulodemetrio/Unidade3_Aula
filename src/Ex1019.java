import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int durationInSeconds = scan.nextInt();

        int hours = durationInSeconds / 3600;
        int minutes = (durationInSeconds % 3600) / 60;
        int seconds = durationInSeconds % 60;

        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        scan.close();
    }
}