import java.util.Random;

class main{
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }

        for(int num : array) {
            System.out.println(num + " ");
        }
        int eventCount = 0;
        int oddCount = 0;

        for(int num : array) {
            if (num % 2 == 0) {
                eventCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кол-во парних чисел: " + eventCount);
        System.out.println("Кол-во непарних чисел: " + oddCount);
    }
}