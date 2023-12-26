package Task1;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String newColor){
        color=newColor;
    }
    public boolean isRed(){
        return color.equalsIgnoreCase("red");
    }
    public boolean isGreen(){
        return color.equalsIgnoreCase("green");
    }

}

