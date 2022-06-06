package com.taller.condicionales;

public class App {

    private static Integer edad;

    public static void main( String[] args ){
        Persona persona = new Persona(edad);
        persona.Mostrar();
    }
}
