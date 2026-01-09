
interface Bird {
    String getName();
    int getLegs();
}
//we know that right we can use lamba expression with functional interface is because
//funcrional interface have only one abstract method , but what if the interface have more
// than one method ? then what we will do ?? we will use anonymous inner class
public class anonymous_class {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public String getName() {
                return "Crow";
            };
            @Override
            public int getLegs() {
                return 2;
            }
        };

        System.out.println(bird.getName());


    }
}
