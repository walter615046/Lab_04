import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

Scanner scan= new Scanner(System.in);
        //variables
        double degreeFahrenheit;
        double degreeCelsius;

        //Ask the temp in F
        System.out.println("What is the temperature in Fahrenheit");
            degreeFahrenheit=scan.nextDouble();
        //Statement Conversion
        degreeCelsius= (degreeFahrenheit-32) * .555555555;

        //Output Celsius
        System.out.println("The temperature in Celsius is " + degreeCelsius);




    }
        }