
import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for x1: ");
        x1 = input.nextDouble();
        System.out.println("Enter the value for y1: ");
        y1 = input.nextDouble();
        System.out.println("Enter the value for x2: ");
        x2 = input.nextDouble();
        System.out.println("Enter the value for y2: ");
        y2 = input.nextDouble();

        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 +") is " + distance + ".");


    }
}
