import java.util.Scanner;

public class Extramain extends Extra{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Extra myShapes = new Extra();
        int choice;

        System.out.println("enter the shape you want the area for");
        System.out.println("1 = Circle");
        System.out.println("2 = Triangle");
        System.out.println("3 = Rectangle");
        int c = s.nextInt();
        myShapes.Perimeter();

        if(c == 1){
        System.out.println("enter the radius of the circle");
        int r = s.nextInt();
        myShapes.Perimeter(r);
        }

        else if(c == 2){
        System.out.println("enter the side of the triangle");
        double a = s.nextDouble();

        System.out.println("enter the base of the triangle");
        double b = s.nextDouble();

        System.out.println("enter the side of the triangle");
        double y = s.nextDouble();
        myShapes.Perimeter(a,b,y);
        }

        else if(c == 3){
        System.out.println("enter the length of the rectangle");
        int l = s.nextInt();

        System.out.println("enter the breadth of the rectangle");
        int j = s.nextInt();
        myShapes.Perimeter(l,j);
        }

        else{
            System.out.println("Enter a valid number");
        }
    }
}
