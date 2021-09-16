import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first value:");
        double value1 = scan.nextDouble();
        System.out.println("enter second value:");
        double value2 = scan.nextDouble();
        System.out.println("enter third value:");
        double value3 = scan.nextDouble();
        System.out.println("enter fourth value");
        double value4 = scan.nextDouble();
        double step1 = value1+value2+value3+value4;
        double average = step1/4;
        System.out.println("Average = " + average);



        // Create a Scanner object to get user input

        // Create a total variable to keep track of the total value

        // Get four pieces of user input

        // Calculate the average

        // Display the result


    }

}
