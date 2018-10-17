package basics.covariant;

public class Cat extends Animal {

    int x = 30;
    static int y = 40;

    /**
     * An overriding method can change the return type to a subclass of the return type
     *
     * @return String (extends Object)
     */
    @Override
    public String getValue() {
        return "test";
    }


}
