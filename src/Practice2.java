import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3!=0 && i%7!=0){ System.out.print(i);
            }
        }
    }
}
