package com.taller.condicionales;

public class App {
    
    private static String titular;
    private static Integer cantidad;

    public static void main( String[] args ){

        Banco banco = new Banco(titular, cantidad);
        banco.Control();
    }
}
