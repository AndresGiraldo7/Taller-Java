package com.taller.condicionales;
import java.util.Scanner;

public class Persona {

    private Integer edad;
    private String nombre;
    private String apellidos;
    private static Scanner input;
    
    public Persona(Integer edad, String nombre, String apellidos) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void Mostrar(){
        System.out.println("Digite su nombre: ");
        input = new Scanner(System.in);
        nombre = input.nextLine();
        System.out.println("Digite sus apellidos: ");
        apellidos =input.nextLine();
        System.out.println("Digite su edad: ");
        edad = input.nextInt();
        System.out.print("\033[H\033[2J");
        if(edad <= 18){
            System.out.println(nombre+" "+apellidos+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }else{
            System.out.println(nombre+" "+apellidos+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }
    }
}
