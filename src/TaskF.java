import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long lastDigit = n % 10;

        System.out.println(lastDigit);
    }
}