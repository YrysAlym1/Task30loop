import javax.swing.plaf.IconUIResource;

public class Task16 {
    public static void main(String[] args) {
        /**16. Напишите метод возвращающий тип int, вы должны в параметры
         метода дать целое положительное число n.
         А метод нам вернёт сумму всех цифр от 0 до n.**/
        System.out.println(numbers(5));
    }

    public static int numbers(int n) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            cont += i;

        }return cont;
    }
}
