package basics;

public class StringBuilderCheck {

    private static StringBuilder stringBuilder = new StringBuilder("test string value");

    public static void main(String[] args) {
        System.out.println(checkAppend());
        System.out.println(checkInsert());
        System.out.println(checkReplace());
        System.out.println(checkSubstring());

        try {
            System.out.println(args[args.length - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    /**
     * Append sequence always to the end.
     *
     * @return
     */
    private static String checkAppend() {
        StringBuilder builder = new StringBuilder(stringBuilder);
        builder.append(" additional");
        // start/end index stands for appended sequence
        builder.append(" sequence", 4, 8);

        return builder.toString();
    }

    /**
     * Insert string at any place in the string.
     *
     * @return
     */
    private static String checkInsert() {
        StringBuilder builder = new StringBuilder(stringBuilder);
//        builder.insert(3, "INSERT");

        // start/end index stands for inserted sequence
        builder.insert(4, "INSERT ME", 0, 6);
        return builder.toString();
    }

    private static String checkReplace() {
        StringBuilder builder = new StringBuilder(stringBuilder);

        // start/end index stands for initial sequence, add the whole value + old value
        builder.replace(3, 6, "INSERT ME");
        return builder.toString();
    }

    private static String checkSubstring() {
        StringBuilder builder = new StringBuilder(stringBuilder);
        boolean b = false;
        int i = 1;
        do {
            i++;
        } while (b = !b);
        System.out.println(i);
        return builder.substring(0, 4);
    }

}
