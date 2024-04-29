import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /**
         * 11. Напишите класс, который заполняет случайными двузначными
         * числами массив, размер которого вводится с клавиатуры.
         * После заполнения класс должен вывести на экран значения
         * массива следующим образом:
         * ● в первой строке – четные значения, содержащиеся в массиве
         * ● во второй строке – нечетные значения, содержащиеся в
         * массиве*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[scanner.nextInt()];


        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10,99);
        }
        System.out.println(Arrays.toString(arrays));

        arrayM(arrays);


    }

    public static void arrayM(int[] arrays) {

        int halfSize = arrays.length / 2;

        System.out.print("жуп сандар: ");
        for (int i = 0; i < halfSize; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.print(arrays[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Так сандар: ");
        for (int i = halfSize; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                System.out.print(arrays[i] + " ");
            }
        }
        System.out.println();

    }
}
