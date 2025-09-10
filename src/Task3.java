import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
            //Variables
            double springCost;
            double summerCost;
            double fallCost;
            double winterCost;
            double totalCost;

            //Ask the cost for each season
        System.out.println("What is the maintenance cost for the spring?");
            springCost=scan.nextDouble();
        System.out.println("What is the maintenance cost for the summer?");
            summerCost=scan.nextDouble();
        System.out.println("What is the maintenance cost for the fall?");
            fallCost=scan.nextDouble();
        System.out.println("What is the maintenance cost for the winter?");
            winterCost=scan.nextDouble();

            //Calculate total cost
        totalCost= springCost + summerCost + fallCost + winterCost;

            //Give total Cost
        System.out.println("The total maintenance year round is $" + totalCost);

    }
}
