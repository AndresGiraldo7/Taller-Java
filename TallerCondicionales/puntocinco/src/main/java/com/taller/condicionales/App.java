package com.taller.condicionales;


public class App {

    private static String cliente;
    private static Integer venta;

    public static void main( String[] args ){
        
        Drogueria drogueria = new Drogueria(cliente, venta);
        drogueria.Mostrar();
    }
}
