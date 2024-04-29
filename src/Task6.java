public class Task6 {
    public static void main(String[] args) {

        /**6. Напишите класс, который принимает с клавиатуры целое
         положительное число любой длины, а затем выводит его первую
         цифру.
         Например, для числа 7659 на экран будет выведено 7.*/
        method(3435);
    }
    public static void method(int number){
        String s = Integer.toString(Math.abs(number));

            int digit = Character.getNumericValue(s.charAt(0));

        System.out.println(digit);
    }
}
