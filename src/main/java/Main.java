import java.util.List;
import java.util.Scanner;
import java.util.Random;
/*
// option 1
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

// option 2

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        boolean isFirstIteration = true; // Changed to a boolean
        int maxSpeed;

        do {
            Race race = new Race();

            // Adjust maxSpeed based on whether it's the first iteration
            if (isFirstIteration) {
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
                    if (scanner.hasNextInt()) {
                        speed = scanner.nextInt();
                        scanner.nextLine();

                        if (isFirstIteration) {
                            if (speed > 0 && speed <= maxSpeed) {
                                validInput = true; // Mark the input as valid
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова: ");
                            }
                        } else {
                            if (speed >= 250 && speed <= maxSpeed) {
                                validInput = true; // Mark the input as valid
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

            isFirstIteration = false; // Set it to false after the first iteration

        } while (playAgain);

        scanner.close();
    }
}

// option 3:

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        boolean isFirstIteration = true; // Changed to a boolean
        int maxSpeed;

        do {
            Race race = new Race();

            if (isFirstIteration) {
                maxSpeed = 250;
            } else {
                maxSpeed = 250 + (new Random().nextInt(51));
            }

            for (int i = 0; i < 3; i++) {
                String name;
                int enteredSpeed = 0;
                int wrongEntries = 0;

                System.out.print(" - Введите название автомобиля #" + (i + 1) + ": ");
                name = scanner.nextLine();
                boolean validInput = false;

                while (!validInput) {
                    System.out.print(" - Введите скорость вашего автомобиля : ");
                    if (scanner.hasNextInt()) {
                        enteredSpeed = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        if (isFirstIteration) {
                            if (enteredSpeed > 0 && enteredSpeed <= maxSpeed) {
                                validInput = true; // Mark the input as valid
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова: ");
                                wrongEntries++;
                            }
                        } else {
                            if (enteredSpeed >= 250 && enteredSpeed <= maxSpeed) {
                                validInput = true;
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова: ");
                                wrongEntries++;
                            }
                        }
                    } else {
                        System.out.println("Пожалуйста, введите целое число.");
                        scanner.nextLine();
                    }
                }

                int finalSpeed = enteredSpeed;
                for (int j = 0; j < wrongEntries; j++) {
                    finalSpeed -= (finalSpeed * 0.1);
                }

                Car car = new Car(name, (int) finalSpeed);
                race.addCar(car);
            }

            List<String> leaders = race.getCurrentLeaders();
            if (!leaders.isEmpty()) {
                System.out.println("\nСамая быстрая машина: " + String.join(", ", leaders));
            }

            System.out.print("Хотите сыграть снова? (да/нет): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("да");

            isFirstIteration = false;

        } while (playAgain);

        scanner.close();
    }
}

 */
// option 3

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        boolean isFirstIteration = true; // Changed to a boolean
        int maxSpeed;

        do {
            Race race = new Race();
            StringBuilder results = new StringBuilder(); // To hold results and finalized speeds
            if (isFirstIteration) {
                maxSpeed = 250;
            } else {
                maxSpeed = 250 + (new Random().nextInt(51));
            }

            // Loop to collect details for 3 cars
            for (int i = 0; i < 3; i++) {
                String name;
                int enteredSpeed = 0;
                int wrongEntries = 0;

                System.out.print(" - Введите название автомобиля #" + (i + 1) + ": ");
                name = scanner.nextLine();
                boolean validInput = false;

                // Input for speed with validation
                while (!validInput) {
                    System.out.print(" - Введите скорость вашего автомобиля: ");
                    if (scanner.hasNextInt()) {
                        enteredSpeed = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        // Validate the speed based on the current iteration
                        if (isFirstIteration) {
                            if (enteredSpeed > 0 && enteredSpeed <= maxSpeed) {
                                validInput = true; // Mark the input as valid
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова.");
                                wrongEntries++;
                            }
                        } else {
                            if (enteredSpeed >= 250 && enteredSpeed <= maxSpeed) {
                                validInput = true; // Mark the input as valid
                            } else {
                                System.out.println(" — Неправильная скорость, попробуйте снова.");
                                wrongEntries++;
                            }
                        }
                    } else {
                        System.out.println("Пожалуйста, введите целое число.");
                        scanner.nextLine(); // Consume the invalid input
                    }
                }

                // Calculate the final speed based on wrong attempts
                double finalSpeed = enteredSpeed;
                for (int j = 0; j < wrongEntries; j++) {
                    finalSpeed -= (finalSpeed * 0.1); // Reduce speed by 10% for each wrong entry
                }

                // Create a car with the final speed
                Car car = new Car(name, (int) finalSpeed);
                race.addCar(car);

                // Append the details to the results StringBuilder
                results.append(" — Автомобиль: ").append(name)
                        .append(", Введенная скорость: ").append(enteredSpeed)
                        .append(", Количество неправильных попыток: ").append(wrongEntries)
                        .append(", Конечная скорость: ").append((int) finalSpeed).append("\n");
            }

            // Find and display the current leaders after entries for all cars
            List<String> leaders = race.getCurrentLeaders();
            if (!leaders.isEmpty()) {
                System.out.println("\nСамая быстрая машина: " + String.join(", ", leaders));
            }

            // Display all input details after all cars have been entered
            System.out.println(results.toString());

            // Ask the user if they want to play again
            System.out.print("Хотите сыграть снова? (да/нет): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("да");

            isFirstIteration = false;

        } while (playAgain);

        scanner.close();
    }
}