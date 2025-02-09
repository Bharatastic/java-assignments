/*
 * Write commands inside main method to find total marks of 5 subjects (Hindi, English, Math, Physics, Chemistry).Find percentage also(out of 500)
    Must display both percentage and total marks
 */

public class Q4 {
    public static void main(String[] args) {
        int hindi = 76;
        int english = 91;
        int math = 87;
        int physics = 92;
        int chemistry = 95;

        int totalMarks = hindi + english + math + physics + chemistry;
        System.out.println("Total Marks: " + totalMarks);

        double totalMarksInPercentage = (totalMarks * 100.0 / 500);
        System.out.println("Total Marks in Percentage: " + totalMarksInPercentage);
    }
}
