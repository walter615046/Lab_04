public class Task4 {
public static void main(String[] args) {

        //Variables
        double ORIGINAL_BALANCE= 5000;
        double INTEREST_RATE = .17;
        double monthOneCost;
        double monthTwoCost;

        //Statements
    monthOneCost = ORIGINAL_BALANCE+(ORIGINAL_BALANCE * INTEREST_RATE);
    monthTwoCost = monthOneCost+ (monthOneCost * INTEREST_RATE);

        //Output
     System.out.println("Your credit card balance after one month is $" + monthOneCost);
     System.out.println("Your credit card balance after two months is $" + monthTwoCost);
}
}
