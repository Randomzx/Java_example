public class feb26 {

}

interface Jumpable {
    int MIN_DISTANCE = 10;
}
interface Moveable {
    String MIN_DISTANCE = "SMALL";
}
class Animal implements Jumpable, Moveable {}  // Compiles successfully; no ambiguous implicit reference to MIN_DISTANCE


class Animal2 implements Jumpable, Moveable {
    Animal2() {
        System.out.println(MIN_DISTANCE); // Won’t compile; implicit reference to MIN_DISTANCE is ambiguous
    }
}

class Animal3 implements Jumpable, Moveable {
    Animal3() {
        System.out.println(Jumpable.MIN_DISTANCE); // Compiles successfully; the reference to MIN_DISTANCE is not ambiguous
    }
}


// An abstract method doesn’t define a body.
// It’s acceptable for a class to extend multiple interfaces that define abstract methods with the same signature
// But you can’t make a class extend multiple interfaces that define methods with the
// same name that don’t seem to be a correct combination of overloaded methods.
// If you change the return type of the method currentPosition() from String to void in the interface Moveable,
// the class Animal won’t compile.
// It would need to implement methods currentPosition, which differ only in their return type, which isn’t acceptable
interface Jumpable2 {
    abstract String currentPosition();
}
interface Moveable2 {

    abstract void currentPosition(); // if the return type is changed to void instead of String
}
class Animal4 implements Jumpable, Moveable { // Won’t compile
    public String currentPosition() {
        return "Home";
    }
}


//  a class, Animal, that extends multiple interfaces, Moveable and Jumpable, which define default methods with the same name, relax().
// If the class Animal doesn’t override the default implementation of relax(), it won’t compile
interface Jumpable3 {
    default void relax() {
        System.out.println("No jumping");
    }
}
interface Moveable3 {
    default void relax() {
        System.out.println("No moving");
    }
}
class Animal5 implements Jumpable, Moveable { }  // Won’t compile; inherits unrelated defaults for relax() from Jumpable and Moveable

class Animal6 implements Jumpable, Moveable { // Compiles successfully
    public void relax() {
        System.out.println("Watch movie");
    }
}

// The default methods that a class inherits from the interfaces that it implements
// must form a correct set of overloaded methods, or else the class won’t compile
interface Jumpable4 {
    default void relax() {
        System.out.println("No jumping");
    }
}
interface Moveable4 {
    default String relax() {
        System.out.println("No moving");
        return null;
    }
}
class Animal7 implements Jumpable, Moveable { } // Won’t compile; relax in Jumpable and Moveable have unrelated return types


// A class can implement multiple interfaces that define static methods with the same name,
// even if they don’t qualify as correctly overloaded or overridden methods.
// This is because they’re not inherited by the class that implements the interfaces:
interface Jumpable5 {
    static int maxDistance() {
        return 100;
    }
}
interface Moveable5 {
    static String maxDistance() {
        return "forest";
    }
}
class Animal8 implements Jumpable, Moveable { }  // Compiles successfully