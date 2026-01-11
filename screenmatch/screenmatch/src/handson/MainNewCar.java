package handson;

public class MainNewCar {
    public static void main(String[] args) {
        NewCarSon myNewCar = new NewCarSon();

        myNewCar.setModelName("Tesla Hiper Sonic 2026");
        myNewCar.setCosts(5000, 6000, 7000);
        myNewCar.setLouncherYear(2000);
        myNewCar.setNowYear(2003);

        myNewCar.showInfos();
        myNewCar.calcDownCosts();

        NewCar NewCar = new NewCar();

        NewCar.setModelName("Fusca 1826");
        NewCar.setCosts(5000, 3000, 2000);
        NewCar.setLouncherYear(2010);
        NewCar.setNowYear(2013);

        NewCar.showInfos();
        NewCar.calcDownCosts();
    }
}
