package com.taller.condicionales;
import java.util.Scanner;

public class Persona {

    private Integer edad;
    private static Scanner input;
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(Integer edad) {
        this.edad = edad;
    }

    public void Mostrar(){
        System.out.println("Cual es su edad: ");
        input = new Scanner(System.in);
        edad = input.nextInt();
        System.out.print("\033[H\033[2J");
        if(edad <= 18){
            System.out.println("Usted aún es un niño(a).");
        }
    }
}
