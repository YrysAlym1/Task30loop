import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /** TASK 2
         //         * 2. Напишите класс, который генерирует 20 рандомных целых чисел
         //         * из диапазона -50 до +50, и определяет наименьшее число и
         //         * наибольшее число.
         //         * - Нельзя использовать массив**/
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int ranNum = random.nextInt(-50,50);
            System.out.print(ranNum + " ");

            if (ranNum < minNum) {
                minNum = ranNum;
            }
            if (ranNum > maxNum) {
                maxNum = ranNum;
            }
        }
        System.out.println(" ");
        System.out.println("min: "+minNum);
        System.out.println("max: "+maxNum);
    }
}
