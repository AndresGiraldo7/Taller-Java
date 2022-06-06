package com.taller.variables;

public class App {
    private static String apellidos;
    private static String nombre;
    private static Integer edad;
    private static Double estatura;
    public static void main(String[] args) {

        Persona persona = new Persona(nombre, apellidos, edad, estatura);
        persona.Mostrar();
        
    }
}