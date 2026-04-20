import java.util.ArrayList;
import java.util.List;

public class Race {
    public final List<Car> cars = new ArrayList<>();
    private int maxSpeed = 0;
    private final List<String> leaders = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
        updateLeaders(car);
    }

    private void updateLeaders(Car car){
        int s = car.getSpeed();
        if (s > maxSpeed) {
            maxSpeed = s;
            leaders.clear();
            leaders.add(car.getName());
        } else if (s == maxSpeed) {
            leaders.add(car.getName());
        }
    }

    public List<String> getCurrentLeaders() {
        return new ArrayList<>(leaders);
    }
}
