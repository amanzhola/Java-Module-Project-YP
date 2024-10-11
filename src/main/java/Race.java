import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();
    private String currentLeader;
    private double leaderDistance;

    public Race(){
        currentLeader = "";
        leaderDistance = 0;
    }

    public void addCar(Car car){
        cars.add(car);
        updateLeader(car);
    }

    private void updateLeader(Car car){
        double distance = car.Distance();
        if(distance > leaderDistance){
            currentLeader = car.getName();
            leaderDistance = distance;
        }
    }

    public String getCurrentLeader(){
        return currentLeader;
    }

    public List<String> getCurrentLeaders() {
        List<String> leaders = new ArrayList<>();
        int maxSpeed = 0;

        for (Car car : cars) {
            if (car.getSpeed() > maxSpeed) {
                maxSpeed = car.getSpeed();
                leaders.clear();
                leaders.add(car.getName());
            } else if (car.getSpeed() == maxSpeed) {
                leaders.add(car.getName());
            }
        }

        return leaders;
    }
}
