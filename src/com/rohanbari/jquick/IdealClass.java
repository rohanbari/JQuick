package com.rohanbari.jquick;

/**
 * Demonstration of how do an ideal class in Java programming language
 * looks like and the best way to practically observe is to do it.
 */
public class IdealClass {
    public static void main(String[] args) {
        // Overriding the methods of the interface specifically to main() of IdealClass
        Package aPackage = new Package() {
            @Override
            public void sayHello() {
                System.out.println("Hello there!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Goodbye dude!");
            }

            @Override
            public void sayWhoHoo() {
                System.out.println("Who Hoo! I'm very happy.");
            }
        };

        // Executing various kinds of overridden methods
        aPackage.sayHello();
        aPackage.sayGoodbye();
        aPackage.sayWhoHoo();

        // Executing inner class method
        InnerClass.doSomething();

        // Executing a method of OuterClass
        OuterClass.executeInner();
    }

    /**
     * Defining the Package interface to override their definitions later on usage.
     */
    interface Package {
        void sayHello();

        void sayGoodbye();

        void sayWhoHoo();
    }

    /**
     * Class which is being defined under the main class, i.e. inner class.
     */
    static class InnerClass {
        protected static void doSomething() {
            System.out.println("I don't have anything to do. But how did you access me?!?");
        }
    }
}

/**
 * Inheriting the IdealClass so that the methods of it could be used in OuterClass.
 */
class OuterClass extends IdealClass {
    public static void executeInner() {
        InnerClass.doSomething();
    }
}
