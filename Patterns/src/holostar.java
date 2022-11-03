import java.util.Scanner;

public class holostar {
    public static void main(String[] args) {
        System.out.println("enter th elimit : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int row = 1; row <=(2*n)-1 ; row++) {
            int starcount = row<=n? row : (2*n)-row;

            for (int sp = 1; sp <=n-starcount ; sp++) {
                System.out.print(" ");
            }

            for (int str = 1; str <= starcount; str++) {
                if(str==1||str==starcount) {
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
