import java.util.Scanner;

public class Q2 {

    static int largestOne(int a, int b, int c, int d) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers: ");

        System.out.print("First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second Number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Third Number: ");
        int thirdNumber = scanner.nextInt();

        System.out.print("Fourth Number: ");
        int fourthNumber = scanner.nextInt();

        scanner.close();

        int result = Q2.largestOne(firstNumber, secondNumber, thirdNumber, fourthNumber);

        System.out.println(result);
    }
}
