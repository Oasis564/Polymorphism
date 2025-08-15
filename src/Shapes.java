public class Shapes {
    public void area(){
        System.out.println("Find the area");
    }

    public void area(int r){
        System.out.println("the circle area is:" + 3.14*r*r);
    }

    public void area(double b, double h){
        System.out.println("the triangle area is:" + 0.5*b*h);
    }

    public void area(int l, int b){
        System.out.println("the rectangle area is:" + l*b);
    }
}