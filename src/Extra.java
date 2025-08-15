public class Extra {
    public void Perimeter(){
        System.out.println("Find the perimeter");
    }

    public void Perimeter(int r){
        System.out.println("the circle perimeter is:" + 2*3.14*r);
    }

    public void Perimeter(double a, double b, double c){
        System.out.println("the triangle perimeter is:" + (a+b+c));
    }

    public void Perimeter(int l, int b){
        System.out.println("the rectangle perimeter is:" + 2*(l*b));
    }
}
