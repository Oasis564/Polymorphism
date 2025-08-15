import java.util.Scanner;

public class App extends  Shapes{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Shapes myShapes = new Shapes();
        int choice;

        System.out.println("enter the shape you want the area for");
        System.out.println("1 = Circle");
        System.out.println("2 = Triangle");
        System.out.println("3 = Rectangle");
        int c = s.nextInt();
        myShapes.area();

        if(c == 1){
        System.out.println("enter the radius of the circle");
        int r = s.nextInt();
        myShapes.area(r);
        }

        else if(c == 2){
        System.out.println("enter the breadth of the triangle");
        double b = s.nextDouble();

        System.out.println("enter the height of the triangle");
        double h = s.nextDouble();
        myShapes.area(b,h);
        }

        else if(c == 3){
        System.out.println("enter the length of the rectangle");
        int l = s.nextInt();

        System.out.println("enter the breadth of the rectangle");
        int j = s.nextInt();
        myShapes.area(l,j);
        }

        else{
            System.out.println("Enter a valid number");
        }
    }
}
