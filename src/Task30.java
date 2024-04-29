public class Task30 {
    public static void main(String[] args) {
        /**
         * 30. Напишите возвращающий метод типа boolean, который в
         * качестве параметра принимает наполненный положительными
         * числами массив.
         * Верните значение true, если в массиве встречаются 3 одинаковых
         * числа подряд, в ином случае false.**/
        System.out.println(positive(new int[]{2, 3, 3, 4, 5}));
    }

    public static boolean positive(int[] massive) {
        for (int i = 0; i < massive.length-2; i++) {
            if (massive[i] == massive[i + 1] && massive[i] == massive[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
