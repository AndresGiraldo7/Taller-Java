package com.taller.condicionales;

public class App {

    private static String usuario;
    private static String novedad;

    public static void main( String[] args ){

        Tienda tienda = new Tienda(usuario, novedad);
        tienda.Mostrar();
    }
}
