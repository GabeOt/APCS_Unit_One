import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is the length of the room?");
        double length = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("What is the width of the room?");
        double width = scan2.nextDouble();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("What is the height of the room?");
        double height = scan3.nextDouble();
        Scanner scan4 = new Scanner(System.in);
        System.out.println("How many doors does the room have?");
        int doors = scan4.nextInt();
        Scanner scan5 = new Scanner(System.in);
        System.out.println("How many windows does the room have?");
        int windows = scan5.nextInt();
        double wall1 = height*width;
        double wall2 = wall1;
        double wall3 = height*length;
        double wall4 = wall3;
        double ceiling = length*width;
        double total1 = wall1+wall2+wall3+wall4+ceiling;
        double aread = (double)(doors*15);
        double areaw = (double)(windows*10);
        double area1 = wall1+wall2+wall3+wall4+ceiling;
        double area2 = area1-aread-areaw;
        double gallons = area2/350;







    }

}
