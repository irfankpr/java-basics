import java.util.Scanner;

public class Startri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {

                if( j==i || j==1 || i==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }
}
