import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month?");
        String month = scan.nextLine();
        System.out.println("What is the current day of the week?");
        String day = scan.nextLine();
        System.out.println("What is the current year?");
        int year = scan.nextInt();
        System.out.println("What is the day of the month");
        int Month2 = scan.nextInt();
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + Month2 + ", " + year);
        System.out.println("European Format:");
        System.out.println(day + ", " + Month2 + " " + month + ", " +year);



    }
}
