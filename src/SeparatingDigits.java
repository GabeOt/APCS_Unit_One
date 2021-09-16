import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 5 digit number");
        int start = scan.nextInt();
        int one = start/10000;
        int remainder1 = start%10000;
        int two = remainder1/1000;
        int remainder2 = remainder1%1000;
        int three = remainder2/100;
        int remainder3 = remainder2%100;
        int four = remainder3/10;
        int remainder4 = remainder3%10;
        int five = remainder4;
        System.out.print(one + "   " + two + "   " + three + "   " + four + "   " + five);

    }
}
