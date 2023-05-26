package abstraction.abstract_classes;

public interface BlueTooth{
    void connectBlueTooth();

    // Methods that has body - later versions of Java

    static int getYear(){
        return 2022;
    }

    // default method (non-static methods that has body)

    default boolean isConnected(){
        return true;
    }
}
