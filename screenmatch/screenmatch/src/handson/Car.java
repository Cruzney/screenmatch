package handson;

public class Car {
    String model;
    int year;
    String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void showTecnic(){
        System.out.println("Model:" + getModel());
        System.out.println("Year:" + getYear());
        System.out.println("Color:" + getColor());
    }

 int calcAge(){
     int currentYear = java.time.Year.now().getValue();
     return currentYear - year;
 }
}
