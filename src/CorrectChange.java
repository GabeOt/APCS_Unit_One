import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cents do you have?");
        int start = scan.nextInt();
        int dollars = start/100;
        int remainderd = start%100;
        int quarter = remainderd/25;
        int remainderq = remainderd%25;
        int dimes = remainderq/10;
        int remainderdi = remainderq%10;
        int nickles = remainderdi/5;
        int remaindern = remainderdi%5;
        int pennies = remaindern/1;
        System.out.print("You have " + dollars + " dollars, " + quarter + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies + " pennies");





    }
}
