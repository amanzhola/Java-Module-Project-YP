import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int iteration = 1;
        int maxSpeed;

        do {
            Race race = new Race();

            if (iteration == 1) {
                maxSpeed = 250;
            } else {
                maxSpeed = 250 + (new Random().nextInt(51));
            }

            for (int i = 0; i < 3; i++) {
                String name;
                int speed = 0;

                System.out.print(" - Введите название автомобиля #" + (i + 1) + ": ");
                name = scanner.nextLine();
                boolean validInput = false;

                while (!validInput) {
                    System.out.print(" - Введите скорость вашего автомобиля : ");
                    if(scanner.hasNextInt()) {
                        speed = scanner.nextInt();
                        scanner.nextLine();

                        if (iteration == 1) {
                            if (speed > 0 && speed <= maxSpeed) {
                                break;
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова: ");
                            }
                        } else {
                            if (speed >= 250 && speed <= maxSpeed) {
                                break;
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова: ");
                            }
                        }
                    } else {
                        System.out.println("Пожалуйста, введите целое число.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                }

                Car car = new Car(name, speed);
                race.addCar(car);
            }

            List<String> leaders = race.getCurrentLeaders();
            if (!leaders.isEmpty()) {
                System.out.println("\nСамая быстрая машина: " + String.join(", ", leaders));
            }

            System.out.print("Хотите сыграть снова? (да/нет): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("да");

            iteration++;

        } while (playAgain);

        scanner.close();
    }
}