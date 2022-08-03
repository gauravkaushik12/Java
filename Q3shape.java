/*Define an abstract class Shape in package P1. Inherit two more classes:
Rectangle in package P2 and Circle in package P3. Write a program to ask the user 
for the type of shape and then using the concept of dynamic method dispatch, 
display the area of the appropriate  subclass.  Also  write  appropriate  methods  
to  read  the  data.  The  main() function should not be in any package.  */
package P1;
public abstract class Shape {
    abstract public double area();
    abstract public void readData();
}
package P2;
import P1.*;
import java.util.Scanner;
public class Rectangle extends Shape{
    double l;
    double b;
    @Override
    public double area() {
        return l*b;
    }

    public void readData(){
        System.out.println("enter length : ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        System.out.println("enter breadth : ");
        b = sc.nextInt();
    }
}
package P3;
import P1.*;
import java.util.Scanner;
public class Circle extends Shape {
    int r;
    @Override
    public double area() {
        return 3.14*r*r;
    }
   public void readData(){
        System.out.println("enter the radius : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
}
package P;

import P1.Shape;
import P2.Rectangle;
import P3.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         System.out.println("PRESS 1 TO CREATE RECTANGLE :");
         System.out.println("PRESS 2 TO CREATE A CIRCLE : ");
         System.out.println("PRESS 0 TO EXIT FROM THE LOOP : ");
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        sel = sc.nextInt();

        Shape shape;
        switch (sel){
            case 1:
                shape = new Rectangle();
                shape.readData();
                System.out.println("AREA of "+shape.getClass().getName()+" "+  shape.area());
                break;
            case 2:
                shape = new Circle();
                shape.readData();
                System.out.println("AREA of  "+shape.getClass().getName()+" "+  shape.area());
                break;
            case 0:
                System.out.println("exited");
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
