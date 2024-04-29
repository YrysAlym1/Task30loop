public class Task27 {
    public static void main(String[] args) {
        /**
         * 27. Напишите возвращающий метод типа String, который в качестве
         * параметра берет String word и целое положительное число n.
         * Нужно создать такой String в котором word будет повторяться n раз,
         * и в конце надо этот String вернуть.
         * Пример: “Hi”, 4 -> “HiHiHiHi”
         * **/
        System.out.println(words("Hi", 4));
    }
    public static String words(String word, int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }
}
