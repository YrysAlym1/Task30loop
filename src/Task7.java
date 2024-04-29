public class Task7 {
    public static void main(String[] args) {
        /**7. Напишите класс, который принимает с клавиатуры целое число
         любой длины и строит из него число с обратным порядком цифр.
         Новое значение следует вывести в консоль.**/

numMethod(33456);
    }

    public static void numMethod(int number) {
        String str = Integer.toString(Math.abs(number));
        int fin = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            fin = Character.getNumericValue(str.charAt(i));
            System.out.print(fin + " ");
        }
    }
}
