import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /**
         * 8. На спектакль в кассу театра было выделено определенное
         * количество билетов, и продажа осуществлялась до тех пор, пока не
         * были проданы все билеты.
         * Напишите класс, который сначала принимает с клавиатуры
         * количество билетов, переданных в кассу. Затем класс принимает с
         * клавиатуры серию чисел, каждое из которых указывает на число
         * билетов, которое желает приобрести покупатель.
         * Если нет возможности продать очередному покупателю требуемое
         * им число билетов, принимается заказ от следующего покупателя.
         * Класс должен вывести в консоль:
         * ● Какое число покупателей приобрели билеты
         * ● Какому числу покупателей было отказано в продаже билетов**/

        System.out.println(cinema());

    }

    public static String cinema() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count2 = 0;
        System.out.println("Напишите число билета: ");
        int numTicket2 = scanner.nextInt();
        while (true) {
            if (numTicket2 > 0) {
            System.out.println("Сколбко билет вы хотите купить?");
            int numSeries2 = scanner.nextInt();

                if (numSeries2 <= numTicket2) {
                    numTicket2 -= numSeries2;
                    System.out.println("Вы купили " + numSeries2 + " билета");
                    System.out.println("Осталось билет: " + numTicket2);
                    count++;
                } else {
                    System.out.println("Мы не можем столько продать!");
                    count2++;
                }
            }else {
                return "Количество покупателей: " + count + "\n" + "Количество отказов: " + count2;
            }
        }
    }
}
