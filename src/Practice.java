import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        boolean prime = true;
        while (prime&&(divider<=maxDivider)){
            if(num%divider == 0){
                prime = false;
            }
            divider++;
        }
        System.out.println("Prime? " + prime);
    }
}
