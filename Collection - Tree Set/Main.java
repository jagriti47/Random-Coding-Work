import java.util.*;

class Person implements Comparable<Person>
{
    String name;

    Person(String name)
    {
        this.name = name;
    }
      

    @Override
    public int compareTo(Person o) {
        return (
            this.name.compareTo(o.name)
        );
    }

    @Override
    public String toString() {
        return "Person name : "+this.name;
    }


}
public class Main
{
    public static void main(String[] args) {
 


        TreeSet<Person> people = new TreeSet<Person>();

        people.add(new Person("peter"));
        people.add(new Person("same"));
        people.add(new Person("mike"));
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));
        

        display("people treeset", people);


        
    
    }

    public static void display(String name,Collection<Person> collection)
    {
        System.out.println("Collection is : "+name);
        System.out.println("Collection contains : ");
        for(Person s: collection)
            System.out.println(s);
    }
}
