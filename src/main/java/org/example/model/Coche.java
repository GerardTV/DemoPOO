package org.example.model;

public abstract class Coche implements Vehiculo {
    private int year;
    private String color;
    private String modelo;
    private static int cocheCreados;

    public Coche(int year, String color, String modelo) {
        this.year = year;
        this.color = color;
        this.modelo = modelo;
        cocheCreados++;
    }

    public abstract void repostar(int nivel);

    public static int getCocheCreados() {
        return cocheCreados;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

}
