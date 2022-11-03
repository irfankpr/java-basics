import java.util.Scanner;

public class addnumsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ary[]=new int[50];
        int pos = 0;
        System.out.print("Enter the size of array : ");
        int size= s.nextInt();
        System.out.print("Enter elements to array : ");
        for (int i = 0; i < size; i++) {
            ary[i]=s.nextInt();
        }
        System.out.print("enter the value to be added : ");
        int val=s.nextInt();

        for (int i = 0; i < size; i++) {
            if((val > ary[i]) && (val < ary[i + 1])){
                pos=i+1;

            }

        }

        for (int i = size-1; i >= pos; i--) {
            ary[i+1]=ary[i];
        }
        ary[pos]=val;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(ary[i]+" ");
        }
    }

}
