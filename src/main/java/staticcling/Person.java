package staticcling;

public class Person {
    String name;
    static int peopleCounter;
    static String classification = "Homo Sapien";

    public Person() {}

    public Person(String name) {
        this.name = name;
        peopleCounter += 1;
    }

    public static String getClassification() {
        return Person.classification;
    }

    public static void setClassification(String classification) {
        Person.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
