public class Task17 {
    public static void main(String[] args) {
        /**17. Напишите метод, который принимает в качестве параметра
         массив целых чисел и число К, число К это индекс в массиве.
         Нам нужно вывести сумму всех чисел до индекса K массива.
         **/
        System.out.println(arrays(new int[]{1, 2, 3, 4, 5, 6, 5}, 4));
    }
    public static int arrays(int [] arr , int k){
        int result = arr.length - k;
        int k1 = arr.length - result;
        int count = 0;
        for (int i = 0; i < k1; i++) {
            count += arr[i];
        }
        return count;
    }
}
