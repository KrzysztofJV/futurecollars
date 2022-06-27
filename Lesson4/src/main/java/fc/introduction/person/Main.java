package fc.introduction.person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Jeff", "Bezos", 1950, 582291842);
        Person person2 = new Person("Jeff", "Bezos", 1950, 582291842);
        Person person3 = new Person("Jeff", "Bezos", 2000, 582191848);

        boolean isEquals1 = person1.equals(person2);
        boolean isEquals2 = person1.equals(person3);
        boolean isEquals3 = person2.equals(person1);

        System.out.println(isEquals1);
        System.out.println(isEquals2);
        System.out.println(isEquals3);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}
