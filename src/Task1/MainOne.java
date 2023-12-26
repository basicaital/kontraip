package Task1;

public class MainOne{
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);
        System.out.println("Горит красный? "+trafficLight.isRed());
        System.out.println("Горит зеленый? "+trafficLight.isGreen());

        trafficLight.changeColor("green");
        System.out.println("Цвет изменился на зеленый!");
        System.out.println("Горит красный? "+trafficLight.isRed());
        System.out.println("Горит зеленый? "+trafficLight.isGreen());

    }
}
