package org.example;

import org.example.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        System.out.println(Coche.getCocheCreados());
        Coche coche1 = new CocheElectrico(1950,"Rojo","Toyota");
        Vehiculo cocheElectrico = new CocheElectrico(2020,"Blanco","Tesla");
        coche1.setColor("Amarillo");
        Vehiculo cocheCombustion = new CocheCombustion(1950,"Verde","Renault");
        ((CocheCombustion)cocheCombustion).repostar(100);
        System.out.println(((CocheCombustion)cocheCombustion).getNivelDeposito());
        vehiculos.add(coche1);
        vehiculos.add(cocheElectrico);
        vehiculos.add(cocheCombustion);
        vehiculos.add(new Bicicleta());

        for (Vehiculo v:vehiculos) {
            v.frenar();
            if (v instanceof Coche) {
                ((Coche) v).repostar(20);
            }
        }
   }
}