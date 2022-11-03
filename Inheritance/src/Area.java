package Inheritance.src;

import java.util.Scanner;

public class Area {
   static Scanner s=new Scanner(System.in);
   //for circle
   public static void circle(){
      final float pi = (float) 3.14;
      System.out.println("Enter the radius : ");

      int r= s.nextInt();
      float A=(pi*(r*r));
       System.out.println("Area of circle is : "+A);
   }
   // for square
   public static void square(){
      System.out.println("Enter the base of square : ");
      float b=s.nextInt();
      System.out.println("Area of square is : "+b*b);
   }
   public static void triangle(){
      System.out.println(" enter the base and height of triangle");
      float h=s.nextInt();
      float b=s.nextInt();
      System.out.println("Area of triangle is : "+ (h*b)/2);
   }
   public static void rectangle(){
      System.out.println("Enter the length and breadth of rectangle : ");
      float b=s.nextInt();
      float l=s.nextInt();
      System.out.println("area of rectangle is :  "+b*l);
   }
}
