public class Task26 {
    public static void main(String[] args) {
        /**
         * 26. Напишите возвращающий метод типа boolean, который в
         * качестве параметра берет массив из положительных чисел.
         * Если в массиве всего 5 чисел равных 2, то вывести true, а в
         * остальных случая false.**/
        System.out.println(truOfFalse(new int[]{1, 2, 2, 2, 2, 2, 3}));

    }
    public static boolean truOfFalse(int [] arrays){
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 2) {
                count++;
                if(count == 5){
                    return true;
                }
            }
        }
        return false;
    }
}
