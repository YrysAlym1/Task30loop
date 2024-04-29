import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**
         * 4. Напишите класс, который принимает с клавиатуры две
         * переменный это два числа, пока не будет введено две одинаковых
         * чисел.
         * Класс должен выводить на экран сумму всех первых чисел и сумму
         * всех вторых чисел (не считая чисел, введенных одинаковыми)**/
        Scanner scanner = new Scanner(System.in);

        int res1 = 0;
        int res2 = 0;
        while (true) {
            System.out.println("Напишите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Напишите второе число: ");
            int number2 = scanner.nextInt();
            if(number1 != number2){
                res1 += number1;
                res2 += number2;
            }else {
                break;
            }
        }
        System.out.println("res1 "+res1);
        System.out.println("res2 "+res2);


    }
}
