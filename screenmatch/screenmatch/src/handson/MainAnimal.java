package handson;

public class MainAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Dino");
        dog.setAge(4);

        dog.makeSound();
        dog.checkTheTail();
        System.out.println(dog.getAge());

        Cat cat = new Cat();
        cat.setName("Chico");
        cat.setAge(3);

        cat.makeSound();
        cat.scratchFurniture();
        System.out.printf( "Your name is: %s ,  and your age is %d ,  ", cat.getName(), cat.getAge() );
    }

}
