package basics.covariant;

public class Dog extends Animal {

    @Override
    public void play(String ball) {
        System.out.println("Dog Playing Soccer with " + ball);
    }
}
