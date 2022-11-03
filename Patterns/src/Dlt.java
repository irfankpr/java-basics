import java.util.Scanner;

public class Dlt {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int ary[]=new int[50];

        System.out.print("Enter the size of array : ");
        int size= s.nextInt();
        System.out.print("Enter elements to array : ");

        for (int i = 0; i < size; i++) {
             ary[i]=s.nextInt();
        }

        System.out.print("enter the position to be deketed : ");
        int pos=s.nextInt();

        for (int i = pos-1; i < size; i++) {
            ary[i]=ary[i+1];
        }size--;

        for (int i = 0; i < size; i++) {
            System.out.print( ary[i]+" ");
        }

    }
}
