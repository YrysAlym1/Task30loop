import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /**9. Напишите класс, который заполняет случайными
         четырехзначными числами массив, размер которого вводится с
         клавиатуры.
         После заполнения класс должен вывести на экран значения
         массива в одной строке, начиная с конца массива ( с последнего
         индекса).
         **/


        int [] array = arrays();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
    public static int [] arrays(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("размер массива: ");
        int [] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000,9999);

        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
