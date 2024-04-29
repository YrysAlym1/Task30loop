import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        /**
         * 15. Напишите не возвращающий метод, который берет массив из
         * рандомных чисел от 1 до 50 и еще одно целое число n.
         * Нужно вывести в консоль сколько раз число n повторялось в
         * массиве.**/
        Random random = new Random();

        int num = 4;
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int ranNum = random.nextInt(1,50);
            array[i] = ranNum;
        }
        method(array,num);
    }
    public static void method(int [] array, int n){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                cont++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Число: " +n);
        System.out.println("Количество повтора: "+cont);
    }

}


