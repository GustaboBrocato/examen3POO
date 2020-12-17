package com.company;

import java.util.ArrayList;

public abstract class Zapatos {
    private String marca;
    private String color;
    private String sexo;
    private double talla;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void imprimirInformacion(){
        System.out.println("Estilo: "+getClass().getSimpleName());
        System.out.println("Marca: "+getMarca());
        System.out.println("Color: "+getColor());
        System.out.println("Talla: "+getTalla());
        System.out.println("Precio: $"+getPrecio());
    }
    public String calzar(){
        String frase = "";

        frase = "Que bien me quedan estos "+getClass().getSimpleName()+", que son talla "+getTalla()+".";

        return frase;
    }


    public abstract void void2File(ArrayList<String> Informacion);
}
