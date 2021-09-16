import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive decimal number");
        double start = scan.nextDouble();
        double step1 = start*10;
        double rounded1 = (int)(step1+0.5);
        double answer = (double)(rounded1/10);
        System.out.println(start + " rounded to the nearest tenth is " + answer);

        // Create a Scanner object

        // Prompt the user for a positive decimal number


        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/


        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
