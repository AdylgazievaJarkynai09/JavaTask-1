import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long tens = (n / 10) % 10;

        System.out.println(tens);
    }
}