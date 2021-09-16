import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give a whole number");
        int start = scan.nextInt();
        int low = start--;
        int high = start++;
        System.out.println(low + start + high);


    }
}
