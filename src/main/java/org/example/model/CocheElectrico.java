package org.example.model;

public class CocheElectrico extends Coche{
    private NivelBateria nivelBateria;

    public CocheElectrico(int year, String color, String modelo) {
        super(year, color, modelo);
        this.nivelBateria = NivelBateria.ALTO;
    }

    @Override
    public void repostar(int nivel) {
        this.nivelBateria = NivelBateria.ALTO;
    }

    @Override
    public void acelerar() {
        nivelBateria = NivelBateria.MEDIO;
    }

    @Override
    public void frenar() {
        System.out.println("Coche "+this.getModelo()+" frenando");
    }


}
