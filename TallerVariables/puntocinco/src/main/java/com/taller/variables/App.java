package com.taller.variables;

public class App {

    private static String NombreMascota;
    private static Integer EdadMascota;
    private static String TipoMascota;
    private static String NombreProp;

    public static void main( String[] args ){
        Descripcion descripcion = new Descripcion(NombreMascota, EdadMascota, TipoMascota, NombreProp); 
        descripcion.Mostrar();
    }
}
