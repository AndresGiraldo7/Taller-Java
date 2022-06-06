package com.taller.ciclos;


public class App {
    static private String nombre;
    static private String placa;
    static private String marca;

    public static void main( String[] args ){
        Parqueadero parquear = new Parqueadero(nombre, placa, marca);
        parquear.Administracion();
        
    }
}
