package com.taller.condicionales;


public class App {
    private static String usuario;
    private static Double peso;
    private static Double estatura;
    private static Double calculoImc;


    public static void main( String[] args ){
      
        Imc imc = new Imc(usuario, peso, estatura, calculoImc);
        imc.Calculando();
    }
}
