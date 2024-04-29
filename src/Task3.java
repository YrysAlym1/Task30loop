import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /**
         * 3. Напишите класс, который принимает с консоли для переменной X
         * целое положительное число, а затем дополнительно будет
         * спрашивать ещё числа, эти числа будут должны вычитаться из
         * переменной x, вы будете вводить числа до тех пор пока X не будет
         * отрицательным или равен 0.
         * - используйте while loop**/
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите число: ");
        int x  = scanner.nextInt();
        while (true){
            System.out.println("Напишите число");
            int num = scanner.nextInt();
             x -= num;
            System.out.println("результат: "+x);
            if (x <= 0) {
                break;
            }

        }
    }
}
