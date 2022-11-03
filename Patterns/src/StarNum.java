import java.util.Scanner;

public class StarNum {
    public static void main(String[] args) {
        System.out.print("Enter thr limit : ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1,j;
        int col = 1;
        for (int row = 1; row <=n*2; row++) {
            for (j = 1; j <= col; j++) {
                if (j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            if (row!=n) {
                col = row <= n ? col + 2 : col - 2;
                i = row< n? i+1 : i-1;
            }
            System.out.println();
        }
    }
}
