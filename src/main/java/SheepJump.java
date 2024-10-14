import java.util.Random;

public class SheepJump {

    public static void main(String[] args) {
        // option 1
        for (int i = 1; i <= 17; i++) {// Здесь нужно объявить цикл
            System.out.println(i + "-я овечка перепрыгнула через забор."); // Это тело цикла
        }
        // Цикл завершён, далее выполнится эта строка:
        System.out.println("Хомяки сыты, овцы целы. Можно отдохнуть!");

        // option 2
        for (int i = 17; i > 0; i--) {// Здесь нужно объявить цикл
            System.out.println(i + "-я овечка перепрыгнула через забор."); // Это тело цикла
        }

        // Цикл завершён, далее выполнится эта строка:
        System.out.println("Хомяки сыты, овцы целы. Можно отдохнуть!");

        // option 3

        int[] a = new int[17];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++) {// Здесь нужно объявить цикл

            int d = random.nextInt(a.length - i);

            System.out.println(a[d] + "-я овечка перепрыгнула через забор."); // Это тело цикла
            a[d] = a[a.length - 1 - i];

        }

        // Цикл завершён, далее выполнится эта строка:
        System.out.println("Хомяки сыты, овцы целы. Можно отдохнуть!");
    }
}
