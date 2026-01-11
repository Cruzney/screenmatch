package handson;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dogs have making AUAU");
    }

    public void checkTheTail() {
        System.out.println( " The " +  getName() + " Putting your Tail to check");
    }
}
