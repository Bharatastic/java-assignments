/*
 * Define four methods inside a class
    a) First method to perform addition on argument and display result
    b) First method to perform subtraction on argument and display result
    c) First method to perform multiplication on argument and display result
    d)First method to perform division on argument and display result
All methods must have two int type argument and must be called by main method
 */

public class Q1 {

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        addition(14, 3);
        subtract(17, 5);
        multiply(4, 5);
        divide(29, 3);
    }
}