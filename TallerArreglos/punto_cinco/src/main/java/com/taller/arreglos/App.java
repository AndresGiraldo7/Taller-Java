package com.taller.arreglos;


public class App {
    static int[][] matriz = new int[10][10];
    
    public static void main( String[] args ){
       Matriz matriz = new Matriz();
       matriz.Multiplicar();
       matriz.Menu(matriz.matriz);
    }
}
