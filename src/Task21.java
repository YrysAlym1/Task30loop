public class Task21 {
    public static void main(String[] args) {
        /**
         * 21. Напишите возвращающий метод типа массива char [], который в
         * качестве параметра берет число n и boolean b.
         * Число n означает количество букв для заполнения, если booelan b
         * будет true, то нужно вернуть char[] массив состоящий из n заглавных
         * букв, если же false то прописными буквами (маленькими).**/
        int n = 5;
        boolean b = false;
        char[] result = chars(n, b);
        System.out.println(result);
    }
    public static char [] chars(int n , boolean b){
        char[] charArr = new char[n];
        char startChar = b ? 'A' : 'a';
        for (int i = 0; i < n; i++) {
            charArr[i] = (char) (startChar + i);

        }
        return charArr;

    }
}
