import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        /**
         * 18. Напишите возвращающий метод типа массива int, который в
         * параметры принимает массив и возвращает новый массив
         * состоящий только из четных элементов массива А.**/
        System.out.println(Arrays.toString(arrays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10})));
    }

    public static int[] arrays(int[] a) {
        int count = 0;
        int [] newA = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                newA[count] = a[i];
                count++;
            }
        }


        return newA;
    }
}
