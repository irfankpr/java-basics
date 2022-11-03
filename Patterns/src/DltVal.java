import java.util.Scanner;

public class DltVal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ary[]=new int[50];
        System.out.print("Enter the size of array : ");
        int size= s.nextInt();
        System.out.print("Enter elements to array : ");

        for (int i = 0; i < size; i++) {
            ary[i]=s.nextInt();
        }

        System.out.print("enter the value to be deleted : ");
        int val=s.nextInt();

        for (int i = 0; i < size; i++) {
            if(val==ary[i]){
                for (int j = i; j < size; j++) {
                    ary[j]=ary[j+1];
                }
            }
        }size--;
        for (int i = 0; i < size; i++) {
            System.out.print( ary[i]+" ");
        }

    }
}
