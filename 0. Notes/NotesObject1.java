public class NotesObject1 {
    public static void main(String[] args) {
        Person person1 = new Person(25, "Mr.", "G");
        Person person2 = new Person(25, "Mr.", "G");
        Person person3 = person1;

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));
    }
}
