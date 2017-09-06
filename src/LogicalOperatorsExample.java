public class LogicalOperatorsExample {
    public static void main(String[] args) {

        // операторы сравнения
        boolean x;
        x = 10 < 2;     // false
        x = 10 > 2;     // true
        x = 10 == 2;    // false
        x = 10 != 2;    // true
        x = 10 != 10;   // false

        x = 10 <= 10;   // true
        x = 5 <= 10;    // true

        x = 10 >= 2;    // true
        // ----------------------------

        boolean y = 3 % 2 == 0;

        // ----------------------------

        x = !true; // false
        x = !false; // true


        int a = 10;
        int b = 30;

        boolean checkA = a < 100;
        boolean checkB = b > 100;

        x = checkA && checkB;
        System.out.println("Данные валидны? " + x);

        x = checkA || checkB;
        System.out.println("Хотябы одно число валидно? " + x);


        x = (a > 18 && checkB) || (10 > 20 && a < 10);
    }
}
