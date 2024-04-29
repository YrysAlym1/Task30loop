import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        /**
         * 23. Напишите возвращающий метод типа массива int[] который
         * берет в параметр число n, мы внутри метода создадим массив int[]
         * размером n.
         * Нам нужно сгенерировать рандомные числа массиву так чтобы
         * каждое следующее число было больше предыдущей.**/
        System.out.println(Arrays.toString(array(5)));
    }

    public static int[] array(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        int plus = 0;
        int count = 0;

        while (count < arr.length) {
            int ranNumber = random.nextInt(1, 99);
            plus += ranNumber;
            arr[count] = plus;
            count++;
        }
        return arr;

    }
}
