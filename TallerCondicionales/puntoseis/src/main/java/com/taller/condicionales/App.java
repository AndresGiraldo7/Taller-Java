package com.taller.condicionales;

public class App {

    private static String moto;
    private static String cliente;
    private static String observacion;
    private static String arreglo;
    private static String salida;

    public static void main( String[] args ){
        
        Maquinista maquinista = new Maquinista(moto, cliente, observacion, arreglo, salida);
        maquinista.Mostrar();
    }   
}
