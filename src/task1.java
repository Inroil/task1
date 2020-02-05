

public class task1 {
    public static void main(String[] args) {
        byte a = 3;
        short b = 5;
        char c = 'b';
        int d = 15;
        long e = 20L;
        float f = 13.7f;
        double g = 22.2;
        boolean h = true;
        String i = "Hello";
        System.out.println(testSum(10 , 10));
        System.out.println(num(-5));
        System.out.println(greaterThanZero(-5));
        System.out.println(name("Alex"));
        System.out.println(year(2019));
    }

    static int sum(int a, int b, int c, int d) {
        int sum = a * (b + (c / d));
        return sum;
    }

    static boolean testSum(int a, int b) {
        int c = a + b;
        if (c < 10 || c > 20)
            return false;
        else return true;
    }

    static String num(int a){
        if (a >= 0)
           return "Число положительное";
        else return "Число отрицательное";
    }

    static  boolean greaterThanZero (int a){
        if(a < 0)
            return true;
        else return false;
    }

    static String name(String a){
        return "Привет, " + a + "!";
    }

    static String year(int a){
        if ((a % 4 == 0 && a != 100) || a % 400 == 0)
            return a + " - это високосный год.";
            else return a + " - это не високосный год.";
    }

   // void myMethod(int a, String b) {}  это две разные сигнатуры одного метода.
   // void myMethod(String b, int a) {}


}
