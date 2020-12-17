package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean repetir = true;

    public static void main(String[] args) {
	// write your code here
        Scanner r = new Scanner(System.in);
        int eleccion, tipo;
        ArrayList<String> InformacionTennis = new ArrayList<String>();
        ArrayList<String> InformacionSandalias = new ArrayList<String>();
        ArrayList<String> InformacionBurros = new ArrayList<String>();
        boolean tempTennis = false,tempSandalias = false, tempBurros= false;

        while(repetir == true) {
            System.out.println("Bienvenido al Inventario\nQue tipo de zapato desea agregar?");
            System.out.println("1. Tennis\t2. Sandalias\t3. Burros");
            eleccion = r.nextInt();


            switch (eleccion) {
                case 1:
                    tipo = 1;
                    tempTennis = true;
                    InformacionTennis.add(agregarInformacion(r,tipo));
                    break;
                case 2:
                    tipo = 2;
                    tempSandalias = true;
                    InformacionSandalias.add(agregarInformacion(r,tipo));
                    break;
                case 3:
                    tipo = 3;
                    tempBurros = true;
                    InformacionBurros.add(agregarInformacion(r,tipo));
                    break;
                default:
                    System.out.println("La eleccion no es valida, intente de nuevo...");
            }
        }
        if(tempTennis==true){
            guardar(1,InformacionTennis);
        } if(tempSandalias == true){
            guardar(2,InformacionSandalias);
        }if(tempBurros == true){
            guardar(3,InformacionBurros);
        }

    }
    public static void guardar(int tipo,ArrayList<String>ListaInformacion){
        Zapatos T = new Tennis();
        Zapatos S = new Sandalias();
        Zapatos B = new Burros();

        switch (tipo){
            case 1:
                T.void2File(ListaInformacion);
                break;
            case 2:
                S.void2File(ListaInformacion);
                break;
            case 3:
                B.void2File(ListaInformacion);
                break;
            default:
        }



    }
    public static String agregarInformacion(Scanner r,int tipo){
        String Informacion= "";
        Zapatos Z = new Zapatos() {
            @Override
            public void void2File(ArrayList<String> Informacion) {

            }
        };
        r.nextLine();
        System.out.println("Ingrese la marca del zapato: ");
        Z.setMarca(r.nextLine());
        System.out.println("Ingrese el color del zapato: ");
        Z.setColor(r.nextLine());
        System.out.println("Ingrese la talla: ");
        Z.setTalla(r.nextDouble());
        r.nextLine();
        System.out.println("Ingrese el sexo: (Hombre/Mujer)");
        Z.setSexo(r.nextLine());
        System.out.println("Ingrese el precio: ");
        Z.setPrecio(r.nextDouble());

        switch(tipo){
            case 1:
                Zapatos T = new Tennis(Z.getMarca(),Z.getColor(),Z.getTalla(),Z.getPrecio(),Z.getSexo());
                Informacion = T.getClass().getSimpleName()+" "+Z.getMarca()+" "+Z.getColor()+" "+Z.getTalla()+" "+Z.getSexo()+" "+Z.getPrecio();
                System.out.println("El zapato agregado es: ");
                T.imprimirInformacion();
                System.out.println(T.calzar());
                repetir(r);
                break;
            case 2:
                Zapatos S = new Sandalias(Z.getMarca(),Z.getColor(),Z.getTalla(),Z.getPrecio(),Z.getSexo());
                Informacion = S.getClass().getSimpleName()+" "+Z.getMarca()+" "+Z.getColor()+" "+Z.getTalla()+" "+Z.getSexo()+" "+Z.getPrecio();
                System.out.println("El zapato agregado es: ");
                S.imprimirInformacion();
                System.out.println(S.calzar());
                repetir(r);
                break;
            case 3:
                Zapatos B = new Burros(Z.getMarca(),Z.getColor(),Z.getTalla(),Z.getPrecio(),Z.getSexo());
                Informacion = B.getClass().getSimpleName()+" "+Z.getMarca()+" "+Z.getColor()+" "+Z.getTalla()+" "+Z.getSexo()+" "+Z.getPrecio();
                System.out.println("El zapato agregado es: ");
                B.imprimirInformacion();
                System.out.println(B.calzar());
                repetir(r);
                break;
            default:
        }



        return Informacion;
    }
    public static void repetir(Scanner r){
        int eleccion;
        System.out.println("Desea agregar otro producto al Inventario?");
        System.out.println("1. Si\t\t\t2. No");
        eleccion = r.nextInt();

        if(eleccion == 1){
            repetir = true;
        }else{
            repetir = false;
        }
    }
}
