import java.util.Scanner;

public class ODstar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit");
        int n= s.nextInt();

        int str=1;
        int spc =n-1;
        for (int row = 1; row <= (n*2)-1; row++) {

            for (int sp = 1; sp <= spc; sp++) {
                System.out.print("  ");
            }

            for (int st = 1; st <= str; st++) {
                System.out.print("* ");
            }
            str = row<n? str+2 : str-2;
            spc = row<n? spc-1 : spc+1;

            System.out.print("\n");
        }
    }
}
