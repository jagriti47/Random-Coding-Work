import java.util.Collection;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

}

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<Person>();

        people.add(new Person("Peter"));
        people.add(new Person("Sam"));
        people.add(new Person("Mike"));
        people.add(new Person("Peter"));
        people.add(new Person("Barry"));
        people.add(new Person("Peter"));
        people.add(new Person("Peter"));
        people.add(new Person("Barry"));
        people.add(new Person("Peter"));
        people.add(new Person("Peter"));
        people.add(new Person("Barry"));
        people.add(new Person("Peter"));
        people.add(new Person("Peter"));
        people.add(new Person("Barry"));
        people.add(new Person("Peter"));

        display("Person Treeset", people);

    }

    public static void display(String name, Collection<Person> collection) {
        System.out.println("Collection is : " + name);
        System.out.println("Collection contains : ");
        for (Person s : collection)
            System.out.println(s);
    }
}

// Output -
// Collection is : Person Treeset
// Collection contains :
// Person [name=Barry]
// Person [name=Mike]
// Person [name=Peter]
// Person [name=Sam]