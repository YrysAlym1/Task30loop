import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /**5. Напишите класс, который принимает с клавиатуры целое число
         любой длины и выводит на экран:
         ● в первой строке - все четные цифры этого числа, через пробел
         ● во второй строке - все нечетные цифры этого числа, через
         пробел
         Например, для числа 765873 в первой строке будет выведены числа
         6 8, а во второй строке 7 5 7 3
         - Нельзя использовать массив
         **/
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        jupMethod(number);
        takMethod(number);
    }

    public static void jupMethod(int number) {
        String str = Integer.toString(Math.abs(number));
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }

        }
        System.out.println();

    }
    public static void takMethod(int number){
        String str = Integer.toString(Math.abs(number));
        for (int i = 0; i <str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
        }
        System.out.println();
    }
}
