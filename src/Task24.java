public class Task24 {
    public static void main(String[] args) {


        /**
         * 24. Напишите метод возвращающий тип boolean , который
         * принимает в качестве параметра массив целых чисел и проверяет,
         * являются ли все элементы массива положительными числами.
         * Если все элементы положительные то вернуть true, в других случая
         * вернуть false.**/
        int[] arr = {-1, 2, 3, 4, 5, 6};
        boolean positiveOfNegative = truFalse(arr);
        if (positiveOfNegative) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static boolean truFalse(int[] array) {
        for (int j : array) {
            if (j <= 0) {
                return false;
            }
        }
        return true;
    }
}
