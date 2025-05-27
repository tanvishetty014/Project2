 class RectanglePerimeter {
     double length = 5;
     double breadth = 10;

    public void calculateAreaRect() {
        double result = length*breadth;
        System.out.println("Area of Rectangle: "+result);
    }

    public void calculateperimRect() {
        double result = 2*(length+breadth);
        System.out.println("perimeter of Rectangle: "+result);
    }
}
public class CircleRectangle2{
     public static void main(String[] args) {
        CircleArea C1 = new CircleArea();
        C1.calculateAreaCircle();
        C1.calculatePeriCircle();
        RectanglePerimeter rectangle = new RectanglePerimeter();
        rectangle.calculateAreaRect();
        rectangle.calculateperimRect();
    }

}


