import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = n + 2 - n % 2;

        System.out.println(result);
    }

    public static class JavaG {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int tens = n / 10;

            System.out.println(tens);
        }
    }
}