package com.taller.variables;
import java.util.Scanner;
class Persona {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Double estatura;
    private static Scanner input;
    public Persona(String nombre, String apellidos, Integer edad, Double estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
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

    public Integer getEdad(Integer edad){
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getEstatura(Double estatura){
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public void Mostrar(){

        System.out.println("Escriba su nombre: ");
        input = new Scanner(System.in);
        nombre = input.nextLine();
        System.out.println("Escriba sus apellidos: ");
        apellidos = input.nextLine();
        System.out.println("Cual es su edad: ");
        edad = input.nextInt();
        System.out.println("Cual es su estatura: ");
        estatura = input.nextDouble();
        System.out.println("Hola "+nombre+" "+apellidos+" edad: "+edad+ " estatura "+estatura);
    }
}