/*
 * Define a parameterized method to convert Indian rupees into American dollar
    Method must have one int type argument to keep Indian rupees
    Method must return converted value
    Write command to call that method in main and display return value
 */

public class Q2 {

    public static double rupeesToDollar(int rupees) {
        return rupees / 87.0; // Exchange rate as of 09th Feb 2025
    }

    public static void main(String[] args) {
        double result = rupeesToDollar(210);
        System.out.println(result);
    }
}
