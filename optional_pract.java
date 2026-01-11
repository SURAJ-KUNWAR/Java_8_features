import java.util.Optional;

public class optional_pract {
    public static void main(String[] args) {
      Optional<String> name = findName(2);
      name.ifPresent(System.out::println);

    }

    private  static Optional<String> findName(int id){
        return Optional.of("Suraj");
        //return Optional.ofNullable(null);
    }

}
