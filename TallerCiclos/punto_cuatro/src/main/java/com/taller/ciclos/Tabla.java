package com.taller.ciclos;
import java.util.Scanner;

public class Tabla {

    private Scanner num;

    public void Multiplicar(){
        Integer opcion;
        num = new Scanner(System.in);
        do{
            System.out.println("Tablas de multiplicar");
            System.out.println("Digite un numero del 1 al 10");
            opcion = num.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println("La tabla del "+opcion+" es:");
            for (int i = 1; i < 11; i++) {
                System.out.println(i + " X " + opcion + " = " + i * opcion);
            }
            System.out.println("Escriba 0 para salir.");
            opcion = num.nextInt();
            if (opcion == 0){
                break;
            }
        }while (opcion != 0);
    }
}
