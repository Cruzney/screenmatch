package handson;

import java.util.Arrays;

public class Student {
   private String name;
    private int age;
    private final double[] notas;

    public Student(String name, double[] notas) {
        this.name = name;
        this.notas = notas;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double calcMedia(){
        if (notas == null || notas.length ==0 ) {
            return 0.0;
        }
        double soma = 0;
        for (double notas : notas) {
            soma += notas;
        }
        
        return soma / notas.length;
    }

    void showInfo(){
        System.out.println("Name of Student: " + name);
        System.out.println("Age of Student: " + age);
        System.out.println("notas of Student: " + Arrays.toString(notas));
    }
}
