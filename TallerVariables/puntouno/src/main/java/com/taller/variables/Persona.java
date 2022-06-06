package com.taller.variables;
import java.util.Scanner;
class Persona {
    private String nombre;
    private String apellidos;
    private static Scanner input;
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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

        System.out.println("Escriba su nombre");
        input = new Scanner(System.in);
        nombre = input.nextLine();
        System.out.println("Escriba sus apellidos");
        apellidos = input.nextLine();
        System.out.println("Hola "+nombre+" "+apellidos);
    }
}
