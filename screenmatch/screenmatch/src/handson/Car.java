package handson;

public class Car {
    String model;
    int year;
    String color;

    void showTecnic(){
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("Color:" + color);
    }

 int calcAge(){
     int currentYear = java.time.Year.now().getValue();
     return currentYear - year;
 }
}
