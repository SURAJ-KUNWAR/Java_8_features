interface  A {
    default void sayHello() {
        System.out.println("Hello from A ");
    }

    static void sayBye(){
        System.out.println("Bye from A");
    }
}

interface  B {
    default void sayHello() {
        System.out.println("Hello from B ");
    }
}
public class Default_Static_Methods implements  A , B {
    @Override
    public void sayHello() {
        B.super.sayHello();
    }
    public static void main(String[] args) {
       Default_Static_Methods demo = new Default_Static_Methods();
       demo.sayHello();

       //demo.sayBye() X X X
       //Default_Static_Methods.sayHello() X X X
       // the only way to call static method from interface is by the interface name
       A.sayBye(); //✅✅
        // how we create a normal class and then do psvm right ???
        // similary we can create an interface and do the same thing inside it as well

    }
}
