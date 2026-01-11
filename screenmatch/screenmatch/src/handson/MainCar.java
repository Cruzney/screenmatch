package handson;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota Corolla");
        car.setYear(2015);
        car.setColor("Red");
        car.showTecnic();
        int age = car.calcAge();
        System.out.println("Car Age: " + age + " Years");
    }
}
