public class Task22 {
    public static void main(String[] args) {
        /**
         * 22. Напишите возвращающий метод типа boolean, который в
         * качестве параметра берет заполненный массив именами, и String
         * name.
         * Нам нужно в массиве найти 2-ой параметр name, если мы его
         * нашли и его индекс это четное число то вернуть true, в иных случаях
         * вернуть false.**/
        System.out.println(tru(new String[]{"Yryskeldi", "Altynbek", "Myrza", "Bek"}, "Aaly"));
    }

    public static boolean tru(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                if (array[i].indexOf(name) % 2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
