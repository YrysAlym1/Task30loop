import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /**
         * 10. Напишите класс, который заполняет случайными двузначными
         * числами массив, размер которого вводится с клавиатуры.
         * После заполнения класс должен вывести на экран значения
         * массива следующим образом:
         * ● в первой строке - первую половину массива
         * ● во второй строке - вторую половину массива**/
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int scNum = scanner.nextByte();

        int arrays [] = new int[scNum];
        for (int i = 0; i < arrays.length; i++) {
            int ranNum = random.nextInt(10,99);
            arrays[i] = ranNum;
        }
        System.out.println(Arrays.toString(arrays));
        array(arrays);
    }
    public static void array(int [] array){
        int halfArr = array.length / 2;
        for (int i = 0; i < halfArr; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = halfArr; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
