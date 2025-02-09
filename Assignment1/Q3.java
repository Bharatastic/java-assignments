/* 
 * Write commands inside main method to calculate profit in percentage
    Declare two variable to keep cost price of product and sell price of product
    Must display profit in percentage
*/

public class Q3 {
    public static void main(String[] args) {
        int costPrice = 119;
        int sellingPrice = 197;
        int profit = sellingPrice - costPrice;

        double profitInPercentage = profit * 100.0 / costPrice;

        System.out.println(profitInPercentage);
    }
}
