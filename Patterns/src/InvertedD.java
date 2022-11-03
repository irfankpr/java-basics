import java.util.Scanner;

public class InvertedD {
    public static void main(String[] args) {
        System.out.println("enter th elimit : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=n;
        for (int row = 1; row <=(2*n)-1 ; row++) { //loop count rows
            int spc= row<=n? row : (2*n)-row;// calculating number of spaces

            for (int str = 0; str <= n-spc; str++) {
                System.out.print("*");
            }
            for (int sp = 1; sp < spc; sp++) {
                System.out.print("  ");
            }

            for (int str=1 ; str<=i; str++) {
                System.out.print("*");
            }
            i=n-spc;
            System.out.print("\n");
        }
    }
}
