import java.util.Arrays;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        /**
         * 20. Напишите не возвращающий метод который получает в качестве
         * параметра не заполненный массив с размером 15.
         * Нужно массив заполнить положительными случайными
         * двузначными четными числами.
         * И вывести элементы массива в консоль в одну строку через пробел.**/
        method(new int[15]);
    }
    public static void method(int [] arr){
        Random random = new Random();
        int count = 0;
        while (count < arr.length){
            int ranNumber = random.nextInt(10,99);
            if(ranNumber % 2 ==0){
                arr[count] = ranNumber;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
