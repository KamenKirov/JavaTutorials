import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        inch=input.nextInt();
        final double CM_PER_INCH = 2.54;
        cm = inch*CM_PER_INCH;
        System.out.println(cm);
    }
}
