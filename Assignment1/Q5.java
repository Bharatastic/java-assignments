/*
 * Write commands inside main method to perform following tasks
    a)Declare 4 int type variable and initialize(assign value) these variables
    b)Assign initial value of first variable to the second variable
    c)Assign initial value of second variable to the third variable
    d)Assign initial value of third variable to the fourth variable
    e)Assign initial value of fourth variable to the first variable
 */

public class Q5 {
    public static void main(String[] args) {
        int first = 7;
        int second = 11;
        int third = 23;
        int fourth = 37;

        int tempfirst = first;
        int tempsecond = second;
        int tempthird = third;
        int tempfourth = fourth;

        second = tempfirst;
        third = tempsecond;
        fourth = tempthird;
        first = tempfourth;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
