package features;

/**
 * Created by vlada on 23.08.16.
 */
@FunctionalInterface
public interface FirstFunctionalInterface {
    //abstract method could be only one
     void doWork();
    //abstract methods from Object class

     String toString();
     boolean equals(Object o);

    //second abstract method, cause error!
//    public boolean isFunctional();

}
