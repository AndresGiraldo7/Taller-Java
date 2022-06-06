package com.taller.ciclos;

public class App {

    static private String usuario;
    


    public static void main( String[] args ){
         Escuela escuela = new Escuela(usuario);
         escuela.Mostrar(usuario);
    }
}
