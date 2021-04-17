import java.util.Scanner;

/**
 * Convert centimeters to feet and inches
 */

public class Convert {
    public static void main(String[] args) {
        double cm;
        int feet,inches,remainder;
        final double CM_PER_INCH = 2.54;
        final double IN_PER_FOOT = 12;
        Scanner input = new Scanner(System.in);
        System.out.print("Exactly how many cm? ");
        cm = input.nextDouble();

        inches = (int)(cm/CM_PER_INCH);
        feet = (int) (inches/IN_PER_FOOT);
        remainder = (int)(inches%IN_PER_FOOT);
        System.out.printf("%.2f cm = %d ft %d in\n",
                cm,feet,remainder);
    }
}
