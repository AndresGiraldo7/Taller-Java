package com.taller.variables;
import java.util.Scanner;
class Persona {
    private String nombre;
    private String apellidos;
    private String nombreM;
    private String apellidoM;
    private String nombreP;
    private String apellidoP;

    private static Scanner input;
    public Persona(String nombre, String apellidos, String nombreM, String apellidoM, String nombreP, String apellidoP) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreM = nombreM;
        this.apellidoM = apellidoM;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
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
    public String getNombreM() {
        return nombreM;
    }
    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }
    public String ApellidoM(){
        return apellidoM;
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public String getNombreP() {
        return nombreP;
    }
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public String ApellidoP(){
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public void Mostrar(){

        System.out.println("Escriba su nombre: ");
        input = new Scanner(System.in);
        nombre = input.nextLine();
        System.out.println("Escriba sus apellidos: ");
        apellidos = input.nextLine();
        System.out.println("Escriba el nombre de su Mamá: ");
        nombreM = input.nextLine();
        System.out.println("Escriba el apellido de su Mamá: ");
        apellidoM = input.nextLine();
        System.out.println("Escriba el nombre de su papá: ");
        nombreP = input.nextLine();
        System.out.println("Escriba el apellido de su papá: ");
        apellidoP = input.nextLine();
        System.out.println("Yo "+nombre+" "+apellidos+" "+" Soy hijo de "+nombreM+" "+apellidoM+" y "+nombreP+" "+apellidoP+".");
    }
}