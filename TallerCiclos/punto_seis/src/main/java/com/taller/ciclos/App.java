package com.taller.ciclos;

public class App {
    static private String nombre;
    static private String org;
    static private Integer tel;
    public static void main( String[] args ){
       
        Libreta contact = new Libreta(nombre, org, tel);
        contact.Administracion();
    }
}
