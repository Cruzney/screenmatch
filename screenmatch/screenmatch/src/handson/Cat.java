package handson;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Cat making MIAUUUU! ");
    }

    public void scratchFurniture() {
        System.out.println("The " + getName() + " Scratch Furniture as ever !!!");
    }
}
