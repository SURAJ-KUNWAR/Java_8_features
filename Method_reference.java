import java.util.Arrays;
import java.util.List;

public class Method_reference {
    public  void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        // method reference is ued to replace lambda expressions
        Method_reference mr = new Method_reference();
        List<String> names = Arrays.asList("Suraj" , "Revati" , "Joynal");
        names.forEach(x -> System.out.println(x));
        names.forEach(mr::print);

    }
}
