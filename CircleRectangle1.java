class CircleArea {
    double radius=5;

    public void calculateAreaCircle() {
        double result = Math.PI*radius*radius;
        System.out.println("Area of circle: "+result);
    }

    public void calculatePeriCircle() {
        double result = 2*Math.PI*radius;
        System.out.println("Perimeter of circle: "+result);
    }
}
