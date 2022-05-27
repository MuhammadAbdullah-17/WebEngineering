import java.util.*;
import java.lang.*;
class Person{
    String name;
    Person(String n)
    {
        name = n;
    }
    void show()
    {
        System.out.println(name);
    }
}
class Teacher extends Person{
    String name;
    Teacher(String n)
    {
        super(n);
    }
    void show()
    {
        super.show();
    }
}
public class PaperPractice {
    
    public static void main(String[] args) {
        Person t1,t2;
        Person p = new Teacher("a");
        Person p2 = new Teacher("b");
        HashMap<Integer,Person> h = new HashMap<Integer, Person>();
        h.put(0, new Person("Ahmad"));
        h.put(1, new Person("Ali"));
        h.put(2, p);
        h.put(3, p2);
        try {
            for (int i = 0; i < h.size(); i++) {
                h.get(i).show();
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
           
    }
    
}
