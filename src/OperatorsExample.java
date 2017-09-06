public class OperatorsExample {
    public static void main(String[] args) {
        int x = 0;
        float y = 0;

        // унарные операторы
        x = 10;
        y = x--; // декремент (постфиксный)
        y = --x; // (префиксный)

        y = x++; // инкремент (постфиксный)
        y = ++x; // (префиксный)

        x++; // x = x + 1;


        // бинарные операторы
        // -------------------------
        x = 2 + 3 + 2 + 2;

        x = 3 % 2;  // 3 - 2 = 1
        x = 4 % 2;  // 2 + 2 = 4    4 - 4 = 0
        x = 5 % 3;  // вернет 2
        // -------------------------



        // приоритеты операторов
        int xxx = 100 + 2 * 2; // 104
        int yyy = (100 + 2) * 2; // 204


        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("a--   = " +  (a--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));


        System.out.println("\n\n");
        x = 1000;
        System.out.println("x + 4 = " + (x + 4));
        System.out.println("x = " + x);

    }
}
