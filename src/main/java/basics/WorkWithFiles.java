package basics;

import java.io.File;

public class WorkWithFiles {

    public static void main(String[] args) {
        File tmpPrivateKey = new File("Q1_TMP_FILE.der");
        File realPrivateKey = new File("Q1_REAL_FILE.der");

        System.out.println(tmpPrivateKey.exists());
        System.out.println(realPrivateKey.exists());

        int a = 10;
        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);
    }
}
