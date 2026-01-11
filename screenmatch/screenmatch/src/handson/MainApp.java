package handson;

import javax.xml.crypto.Data;
import java.time.Year;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameFirst;
        String nameSecond;
        int ageFirst, ageSecond;
        int today = Year.now().getValue();
        char sexFirst, sexSecond;
        double salaryFirst, salarySecond;

        System.out.println("Name of first person: ");
        nameFirst = input.nextLine();
        System.out.println("Age of first person: ");
        ageFirst = input.nextInt();
        System.out.println("Sex (F/M): ");
        sexFirst = input.next().charAt(0);
        System.out.println("Salary of first person: ");
        salaryFirst = input.nextDouble();

        System.out.println("----------------------------");

        System.out.println("Name of second person: ");
        input.nextLine(); // Limpeza de buffer, fiz leitura de dado anterior com input
        nameSecond = input.nextLine();
        System.out.println("Age of second person: ");
        ageSecond = input.nextInt();
        System.out.println("Sex (F/M): ");
        sexSecond = input.next().charAt(0);
        System.out.println("Salary of second person: ");
        salarySecond = input.nextDouble();

        System.out.println("-------------------------------");

        System.out.printf(" Show First Person, Name: %s  - Age: %d -  Sex: %s - Salary: %.2f - Data: %d %n ", nameFirst, ageFirst, sexFirst, salaryFirst, today );

        System.out.printf(" Show Second Person, Name: %s - Age: %d - Sex: %s - Salary: %.2f - Data: %d ", nameSecond, ageSecond, sexSecond, salarySecond, today );

        input.close();

    }
}