public class Task12 {
    public static void main(String[] args) {
        /**
         * 12. Создайте не возвращающий метод в параметры которого, вы
         * даете массив из целых чисел и еще целое число n.
         * Метод должен проверить есть ли в массиве число большее или
         * равное n.
         * Если есть такое число вывести в консоль true, в другом случае false**/
        System.out.println(trueOfFalse(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 44));
    }
    public static boolean trueOfFalse(int [] numbers , int n){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= n){
                return true;
            }
        }
        return false;
    }
}
