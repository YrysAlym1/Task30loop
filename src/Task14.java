import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        /**
         * 14. Напишите не возвращающий метод который в параметры берет
         * массив из рандомных чисел от 1 до 50 и выводит в консоль только
         * те числа что больше 20.**/
        Random random = new Random();
        int [] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            int ranNumber = random.nextInt(1,50);
            arrays[i] = ranNumber;
        }
        System.out.println(Arrays.toString(arrays));
        numbers(arrays);
    }
    public static void numbers(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 20){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
