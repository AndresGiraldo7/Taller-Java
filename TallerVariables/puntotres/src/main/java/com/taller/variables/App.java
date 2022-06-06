package com.taller.variables;

public class App {
    private static String apellidos;
    private static String nombre;
    private static String nombreM;
    private static String apellidoM;
    private static String nombreP;
    private static String apellicoP;

    public static void main(String[] args) {
        Persona persona = new Persona(nombre, apellidos, nombreM, apellidoM, nombreP, apellicoP);
        persona.Mostrar();       
    }
}