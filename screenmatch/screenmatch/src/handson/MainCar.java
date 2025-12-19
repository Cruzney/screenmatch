package handson;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Toyota Corolla";
        car.year = 2015;
        car.color = "Prata";
        car.showTecnic();
        int age = car.calcAge();
        System.out.println("Idade do carro: " + age + " anos");
    }
}
