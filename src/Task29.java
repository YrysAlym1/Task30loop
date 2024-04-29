public class Task29 {
    public static void main(String[] args) {
        /**
         * 29. Напишите возвращающий метод типа boolean, который в
         * качестве параметра принимает наполненный положительными
         * числами массив.
         * Верните значение true, если один из первых 4 элементов в массиве
         * равен 9. Длина массива может быть меньше 4.**/
        System.out.println(trueOfFalse(new int[]{2, 3, 3, 9, 1,4}));
    }
    public static boolean trueOfFalse(int [] positive){
        for (int i = 0; i < 4; i++) {
            if(positive[i] == 9){
                return true;
            }
        }
        return false;
    }
}
