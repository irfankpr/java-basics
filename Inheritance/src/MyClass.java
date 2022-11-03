import java.util.Scanner;

public class MyClass extends Area{
    public static void main(String[] args) {

        System.out.println("1: Square  2: Triangle  3: Rectangle  4:circle");
        int cho=s.nextInt();
        switch (cho){
            case 1: square();
                    break;
            case 2: triangle();
                    break;
            case 3: rectangle();
                    break;
            case 4: circle();
                    break;
            default:
                System.out.println("Invalid Choice");
        }
    }

}
