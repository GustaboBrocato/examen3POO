package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Burros extends Zapatos{

    public Burros(String marca, String color, double talla, double precio,String sexo){
        setMarca(marca);
        setColor(color);
        setTalla(talla);
        setPrecio(precio);
        setSexo(sexo);
    }

    public Burros() {

    }

    @Override
    public void void2File(ArrayList<String> Informacion) {
        File archivo;
        FileWriter agregar;
        PrintWriter escribir;
        archivo = new File(getClass().getSimpleName()+".txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new PrintWriter(archivo,"utf-8");
                for(int x = 0; x < Informacion.size();x++){
                    escribir.println(Informacion.get(x));
                }
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try{
                agregar = new FileWriter(archivo,true);
                escribir = new PrintWriter(agregar);
                for(int x = 0; x < Informacion.size();x++){
                    escribir.println(Informacion.get(x));
                }
                escribir.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
