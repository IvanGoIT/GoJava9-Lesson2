import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        System.out.println("текс"); // вывод (output)

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Х");
        int x = sc.nextInt(); // ввод

        System.out.println("x * x = " + (x * x));
        System.out.println(x + " * " + x + " = " + (x * x));

        System.out.println("Введите Y");
        float y = sc.nextFloat(); // ввод

        System.out.println("y = " + y);

        System.out.println("Введите str");
        String str = sc.nextLine();
        System.out.println("str = " + str);
    }
}
