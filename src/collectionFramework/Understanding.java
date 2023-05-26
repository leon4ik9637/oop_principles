package collectionFramework;

public class Understanding {
    public static void main(String[] args) {
    }
    /*
        Collection: it is used to store multiple same items in the
        same place (collection)

        Array:
        - It is used to store both primitives and reference types as
        collections
        - fixed size. Once the size is declared, you cannot add or remove
        elements (size cannot be changed)
        - Array does not provide methods to manipulate the data
        - Arrays allow duplicates
        - Arrays allow null Objects
        -

        NOTE: Except arrays, all other collections are used to
        store objects only (not primitives)

        These collections have some differences, and we can compare them
        with below differences
        - duplication
        - having nulls
        - Order

        LIST INTERFACE
        - List allows duplication
        - List allows null Objects
        - List keeps insertion order. It provides all the methods
        with indexes

                    Iterable
                    Collection
                    List
        ArrayList - LinkedList - Vector

        Set Interface
        - Set does not allow duplicates
        - Set allows only 1 null Object (data) since it doesn't allow duplicates
        BUT TreeSet does not allow any null elements because it sorts.
        - Set does not preserve insertion order. That is why you will
        never know where is your elements stored in the Set, and it does not
        provide any methods that use index as arguments.


                    Iterable
                    Collection
                    Set
        HashSet     LinkedHashSet       TreeSet


                                  Map
        HashMap     LinkedHashMap       HashTable       TreeMap



         */


}
