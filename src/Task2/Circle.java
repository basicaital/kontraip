package Task2;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
}
