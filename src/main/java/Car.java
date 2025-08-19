public class Car {

    private final String name;
    private final int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public int getSpeed(){
        return speed;
    }

}