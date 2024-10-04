package org.example.model;

public class CocheCombustion extends Coche {
    private int nivelDeposito;

    public CocheCombustion(int year, String color, String modelo) {
        super(year, color, modelo);
    }

    @Override
    public void acelerar() {
        nivelDeposito -= 1;
    }

    @Override
    public void frenar() {
        System.out.println("Coche combustion frenando.");
    }

    public int getNivelDeposito() {
        return nivelDeposito;
    }

    public void repostar(int litros) {
        if(litros < 0){
            return;//no dejamos que nos quiten gasolina del deposito
        }
        this.nivelDeposito += litros;
    }
}
