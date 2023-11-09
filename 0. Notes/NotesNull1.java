public class NotesNull1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = null;

        System.out.println(person1 == null);
        System.out.println(person2 == null);
        System.out.println(person1 != null);
        System.out.println(person2 != null);
    }
}
