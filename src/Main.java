public class Main {
    public static void main(String[] args) {
        // это комментарии в коде они не учитываются компилятором

        /*
         текст
         текст
         1111
         */

        // System.out.println("Text");

        // byte = 8 bite
        // bite 0 - 1
        // 00000000
        // 00000010
        // 00001111


        // 3 в бинарном виде:
        // 0000 - 0
        // 0001 - 1
        // 0010 - 2
        // 0011 - 3

        byte b = -1;        // 1 byte
        short s = 10000;    // 2 byte 2^16 = 32 000
        int i = 2000000;    // 4 byte 2^32 = 2 147 000 000      ***
        long l = 100000000; // 8 byte

        float f = 0.5f;     // 4 byte                           ***
        double d = 0.5;     // 8 byte                           ***

        boolean bool = true; //                                 ***
        boolean bool2 = false;

        char c = '9';

        String str = "1234 sss ooo llll";
        String str2 = "====(((()))))";
        String str3 = "\ttext\ntext 2\t-tab";


        String tree = "   /    \\";

        System.out.println(tree);

        int x = 0;
        float y = 50.529342f;

        int z = (int)y;
    }
}
