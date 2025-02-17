public class Q5 {

    static double incomeTax(int income) {
        double tax = 0.0;

        if (income > 1000000) {
            tax += (income - 1000000) * 30 / 100;
            income = 1000000;
        }

        return tax;

    }

    public static void main(String[] args) {

    }
}
