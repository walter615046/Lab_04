import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);
        //variables
        double itemCost;
        double SALES_TAX= .05;
        double totalCost;

        //Ask user the price of purchase
        System.out.println("What is the price of your purchase?");
            itemCost=scan.nextDouble();//
        totalCost= itemCost+(itemCost*SALES_TAX);

        //Give user total cost
        System.out.println("Your total cost is $" + totalCost);
    }
}