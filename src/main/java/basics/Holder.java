package basics;


public class Holder {
    String a = "x";
    static char b = 'x';
    String c = "x";
    class Inner {
        String a = "y";

        String get() {
            String c = "temp";

            // Line 1
            return c;
        }
    }

    Holder() {
        System.out.println(new Inner().get());
    }

    public static void main(String args[]) {
        int i = 0, j = 5;
        lab1:
        for (; ; i++) {
            for (; ; --j) if (i > j) break lab1;
        }
        System.out.println(" i = " + i + ", j = " + j);
        new Holder();
    }
}