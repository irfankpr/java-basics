import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= s.nextInt();
        int tmp=1;
        for (int row = 0; row <= n; row++) {
            for (int spc=1; spc <=n-row; spc++) {
                System.out.print("  ");
            }
            for (int col = 0; col<row; col++) {
                if(col==0 || col==row){
                    System.out.print(" 1 ");
                }else {
                    tmp=tmp*(row-col)/col;
                    System.out.print("  "+tmp+" ");
                }

            }
            System.out.print("\n");
        }

    }
}

