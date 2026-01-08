public class Lambda_and_Functional_Interface {
    public static void main(String[] args) {
        // Steps to make a lambda function
        // remove modifier
        // remove return type
        // remove method name
        // place arrow
        //lets convert some functions to lambda expressions
        // @Functional Interface annotation makes sure that the interface is a functional interface
        // if we use the above annotation and the interface doesnt have one abstract method than it
        // that case our compiler will throw compile time issues

        // benefits of  lambda
        // 1) make code more readable
        // 2) enable funcional programming
        // 3) reduction of jar file size
        Greetings g = (String name) -> {
            System.out.println("Hello" + name);
        };
    }
 @FunctionalInterface
    interface Greetings{
        public  void sayHello(String name);
    }

}
