package basics.covariant;

public class Animal {
    int x = 10;
    static int y = 20;

    public void setValue(String value) {

    }

    public Object getValue() {
        return new Object();
    }

    public void play(String ball) {
        System.out.println("Animal Playing Soccer with " + ball);
    }

    public void play() {
        System.out.println("Playing...");
    }
}
