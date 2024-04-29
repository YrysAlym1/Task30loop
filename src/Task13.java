public class Task13 {
    public static void main(String[] args) {
        /**
         * 13. Напишите не возвращающий метод, который берет в параметры
         * массив из boolean типа, и выводит в консоль количество true
         * элементов массива.**/
        method(new boolean[]{true,true,false,true,false});
    }
    public static void method(boolean [] trueOfFalse){
        int count = 0;
        for (int i = 0; i < trueOfFalse.length; i++) {
            if(trueOfFalse[i]){
                count++;
            }
        }
        System.out.println("Количество true: "+count);
    }
}
