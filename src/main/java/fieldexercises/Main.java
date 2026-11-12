package fieldexercises;

public class Main {
    public static void main(String[] args) {
        Person alice = new Person();
        alice.name = "Alice";
        alice.age = 20;

        Person bob = new Person();
        bob.name = "Bob";
        bob.age = 22;

        System.out.println(alice.name + ", " + alice.age + ", " + Person.classroom);
        System.out.println(bob.name + ", " + bob.age + ", " + Person.classroom);

        alice.age++;

        System.out.println("----------------");
        System.out.println(alice.name + ", " + alice.age + ", " + Person.classroom);
        System.out.println(bob.name + ", " + bob.age + ", " + Person.classroom);

        Person.classroom = "Room 202";

        System.out.println("----------------");
        System.out.println(alice.name + ", " + alice.age + ", " + Person.classroom);
        System.out.println(bob.name + ", " + bob.age + ", " + Person.classroom);

        Person chuck = new Person();
        chuck.name = "Chuck";
        chuck.age = 60;

        System.out.println(chuck.name + ", " + chuck.age + ", " + Person.classroom);

    }
}