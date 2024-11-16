import java.util.Scanner;
class ArrayCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Розмiр має бути бiльше за 0");
            return;
        }

        int[] array = new int[size];
        System.out.println("Введіть " + size + " елементів масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Перевірити на зростання (1) чи спадання (2): ");
        int choice = scanner.nextInt();

        boolean result = false;
        if (choice == 1) {
            result = isAscending(array);
        } else if (choice == 2) {
            result = isDescending(array);
        } else {
            System.out.println("Невірно");
            return;
        }

        if (result) {
            System.out.println("Масив відповідає обраному порядку.");
        } else {
            System.out.println("Масив не відповідає обраному порядку.");
        }
    }

    private static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
