import java.util.Scanner;

public class Tostr {
    public static void main(String[] args) {
       int a[]=new int[10];
       Scanner s=new Scanner(System.in);
        System.out.println(" enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            a[i]=s.nextInt();
            if(a[i]%2!=0){
                a[i]='*';
            }
        }
        for (int i = 0; i < 6; i++) {
            if(a[i]=='*'){
                System.out.print((char)a[i]+" ");
            }else {
                System.out.print(a[i]+" ");
            }
        }



    }
}
