package com.taller.ciclos;

import java.util.Scanner;

public class Saludo {
    String persona;
    static Scanner input = new Scanner(System.in);
    Integer n = 1;
    Integer i =1;
    Integer enter = 1 ;
    public void Saludar(){
        System.out.println("Digita tu nombre: ");
        persona = input.nextLine();
        do{ 
            System.out.println(i+" ****Saludo Infinito****");
            System.out.println("Hola "+persona+" te voy a saludar cada vez que dijites la tecla 1 y presiones un enter.");
            i++;
            System.out.println("Escriba cualquier letra Si ya no quieres que te saluden más.");
            enter = input.nextInt(); 
        } while (n!= 0 );
    }
}
