package handson;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;

public class NewCar {
    private String modelName;
    private int louncherYear;
    private int nowYear;
    protected ArrayList<Double> costs = new ArrayList<>();

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getLouncherYear() {
        return louncherYear;
    }

    public void setLouncherYear(int louncherYear) {
        this.louncherYear = louncherYear;
    }

    public int getNowYear() {
        return nowYear;
    }

    public void setNowYear(int nowYear) {
        this.nowYear = nowYear;
    }

    public void setCosts(double cost01, double cost02, double cost03) {
        costs.clear();
        costs.add(cost01);
        costs.add(cost02);
        costs.add(cost03);
    }

    public void showInfos() {
        System.out.println("Model: " + modelName);
        System.out.println("Year Louncher" + getLouncherYear());
        System.out.println("Year Now: " + getNowYear());
        System.out.println("Car Age: " + (getNowYear() - getLouncherYear()) );
        System.out.println("Min Cost: " + Collections.min(costs));
        System.out.println("Max Cost: " + Collections.max(costs));
        System.out.println("--------------------------");
    }

    public void calcDownCosts() {
        if (costs.isEmpty()) {
            System.out.println("Error: Any information costs available. ");
        } else if (costs.size() >= 2) {
            double startCost = costs.getFirst();
            double finalCost = costs.getLast();
            double unisame = finalCost - startCost;
            double percent = ( unisame / startCost) * 100;

            System.out.printf("All Variable Costs ( Year one for Last Year: ) $ %.2f (%.2f%%)%n " , unisame, percent);

            /* Marcador,Tipo de Dado,Exemplo ( printf )
                %s,String (texto),"""Olá %s"""
                %d,"Inteiro (int, long)",%d anos
                %f,"Ponto Flutuante (double, float)",R$ %.2f
                %n,Quebra de linha,(Independente do sistema operacional)
                %t,Data/Hora,%tT (Hora atual)
             */

          if( finalCost > startCost ) {
                System.out.println("Status: The vehicle UpCosts % ." + percent);
            } else {
                System.out.println("Status: The vehicle Down Costs in period % ! " + percent );
            }
        }
    }

}
