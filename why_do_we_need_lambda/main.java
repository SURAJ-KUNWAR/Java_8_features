package why_do_we_need_lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student{
    String name ;
    int id ;

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class main {
    public static void main(String[] args) {
        Employee employee = new SoftwareEngineer();
        System.out.println(employee.getName());
        // now if you see above what we did we had an interface and for that only one abstract method exists
        // so what we did we created an implementation class but with lamba expression we can easily do it
        // without creating an implementation class see below

        Employee se = () -> { return "Software Engineer"; };
        System.out.println(se.getName());

        // now we can use lambda expression as well for using threads
        Runnable runnable = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        List<Student> empys = Arrays.asList(new Student("Suraj" , 3) , new Student("Revati" , 10));
        Collections.sort(empys , (a,b) -> b.name.compareTo(a.name));
        System.out.println(empys);
    }
}
