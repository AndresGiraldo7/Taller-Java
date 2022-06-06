package com.taller.condicionales;

public class App {

    private static Integer edad;
    private static String nombre;
    private static String apellidos;

    public static void main( String[] args ){
        Persona persona = new Persona(edad, nombre, apellidos);
        persona.Mostrar();
    }
}
