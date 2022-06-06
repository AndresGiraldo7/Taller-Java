package com.taller.variables;

public class App {

    private static String pais;
    private static String ciudad;

    public static void main( String[] args ){
        Espacio espacio = new Espacio(pais, ciudad);
        espacio.Mostrar();
    }
}
