import java.util.Scanner;

public class Q3 {

    static String bloodDonationEligibility(double weight) {

        if (weight < 50.0) {
            return "You must weigh at least 50 kilograms to donate blood";
        }
        return "You are eligible to donate blood";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You must be at least 18 years old to donate blood");
        } else {
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();

            String result = Q3.bloodDonationEligibility(weight);
            System.out.println(result);
        }

        scanner.close();
    }
}
