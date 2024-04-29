import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /** TASK 1
         //         * 1. Напишите класс, который создает 20 случайных чисел диапазона
         //         * 1 - 99. Следует вывести в консоль только те числа которые делятся
         //         * на 1-ое рандомное число без остатка.
         //         * - Нельзя использовать массив.**/
        Random random = new Random();
        int count = 1;
        int num = random.nextInt(1, 99);
        System.out.println("number1: " + num);
        while (count < 20) {
            int number = random.nextInt(1, 99);
            if (number % num == 0) {
                System.out.print(number + " ");
            }
            count++;

        }
    }
}
