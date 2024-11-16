class main {
    public static void main(String[] args) {
        final int valuesPerRow = 10;

        System.out.println("Таблиця синусів для значень від 0 до 90 градусів:");
        int count = 0;

        for (int angle = 0; angle <= 90; angle++) {
            double sinValue = Math.sin(Math.toRadians(angle));
            System.out.printf("%3d°: %.4f  ", angle, sinValue);

            count++;
            if (count % valuesPerRow == 0) {
                System.out.println();
            }
        }

        if (count % valuesPerRow != 0) {
            System.out.println();
        }
    }
}
