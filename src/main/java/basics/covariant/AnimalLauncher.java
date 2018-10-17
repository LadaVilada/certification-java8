package basics.covariant;

/**
 * Covariant returns are allowed since Java 1.5,
 * which means that an overriding method can change the return type to a subclass of the return type declared
 * in the overridden method. But remember than covariant returns does not apply to primitives.
 */
public class AnimalLauncher {

    public static void main(String[] args) {
        addWrongType();
    }

    /**
     * Thrown to indicate that an attempt has been made to store
     * the wrong type of object into an array of objects.
     */
    private static void addWrongType() {
        Animal dog = new Dog();
        dog.play();
        dog.play("animal  ball");

        Dog realDog = (Dog) dog;
        realDog.play("only dog ball");
        realDog.play();

        new Dog().play("test");
        new Dog().play();
    }
}
