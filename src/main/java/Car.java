public class Car {

    private String name;
    private int speed;

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

    public int Distance(){
        return speed * 24;
    }
}
