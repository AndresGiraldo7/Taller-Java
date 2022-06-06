package com.taller.variables;


public class App {
    private static String apellidos;
    private static String nombre;

    public static void main(String[] args) {

        Persona persona = new Persona(nombre, apellidos);
        persona.Mostrar();
        
    }
}