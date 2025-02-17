import java.util.Scanner;

public class Q1 {

    static String grade(int a, int b, int c, int d, int e) {
        int obtainedMarks = a + b + c + d + e;
        int totalMarks = 500;

        double percentage = (obtainedMarks / (double) totalMarks) * 100;

        String grading;
        if (percentage >= 85) {
            grading = "Excellent";
        } else if (percentage >= 70) {
            grading = "Very good";
        } else if (percentage >= 55) {
            grading = "Good";
        } else if (percentage >= 40) {
            grading = "Poor";
        } else {
            grading = "Very Poor";
        }

        return grading;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of the following subjects (out of 100): ");

        System.out.print("Hindi: ");
        int hindi = scanner.nextInt();

        System.out.print("English: ");
        int english = scanner.nextInt();

        System.out.print("Math: ");
        int math = scanner.nextInt();

        System.out.print("Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();

        scanner.close();

        String result = Q1.grade(hindi, english, math, physics, chemistry);
        System.out.println("Grade: " + result);
    }
}