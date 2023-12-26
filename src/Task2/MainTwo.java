package Task2;

public class MainTwo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Радиус = "+circle.getRadius());
        System.out.println("Площадь = "+circle.Area());
        System.out.println("Длина  = "+circle.Circumference());

        circle.setRadius(4.2);
        System.out.println("Радиус = "+circle.getRadius());
        System.out.println("Площадь = "+circle.Area());
        System.out.println("Длина  = "+circle.Circumference());
    }
}
