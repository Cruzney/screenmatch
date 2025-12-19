package handson;

public class MainAgePeople {
    public static void main(String[] args) {
        AgePeople person1 = new AgePeople();
        person1.setName("Alice");
        person1.setAge(20);

        AgePeople person2 = new AgePeople();
        person2.setName("Bob");
        person2.setAge(15);

        System.out.println(person1.getName() + " é " + person1.isAdult());
        System.out.println(person2.getName() + " é " + person2.isAdult());
    }
}
