public class Task19 {
    public static void main(String[] args) {
        /**
         * 19. Напишите возвращающий метод типа String, который в качества
         * параметра прнинимает число, и возвращает день недели как слово
         * String.
         * (Можно использовать switch or if else)**/
        System.out.println(week(1));
    }
    public static String week(int number){
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not now!";
        };
    }
}
