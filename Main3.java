import java.util.Scanner;
import java.util.Random;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Початковий масив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Введіть значення для пошуку: ");
        int searchValue = scanner.nextInt();

        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                array[i] = newValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Значення змынено.");
        } else {
            System.out.println("Значення не знайдено.");
        }

        System.out.println("Оновлений масив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
