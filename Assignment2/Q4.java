import java.util.Scanner;

public class Q4 {

    static String weirdNumber(int n) {
        String message;
        if (n % 2 != 0) {
            message = "Weird";
        } else if ((n >= 2) && (n <= 5)) {
            message = "Not Weird";
        } else if (n >= 6 && n <= 20) {
            message = "Weird";
        } else {
            message = "Not Weird";
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        String result = Q4.weirdNumber(n);
        System.out.println(result);
    }
}
