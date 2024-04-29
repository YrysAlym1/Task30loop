public class Task28 {
    public static void main(String[] args) {
        /**
         * 28. Напишите возвращающий метод типа boolean, который в
         * качестве параметров принимает массив целых чисел.
         * Верните значение true, если последовательность чисел 1, 2, 3 где-то
         * появляется в массиве.**/
        System.out.println(trueOfFalse(new int[]{1, 3, 1, 2, 3}));
    }
    public static boolean trueOfFalse(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 && numbers[i+1] == 2 && numbers[i+2] == 3){
                return true;
            }
        }
        return false;
    }
}
