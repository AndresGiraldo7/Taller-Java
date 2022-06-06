package com.taller.variables;
import java.util.Scanner;

public class Descripcion {
    private String NombreMascota;
    private Integer EdadMascota;
    private String TipoMascota;
    private String NombreProp;
    private static Scanner input;
    
    public Descripcion(String nombreMascota, Integer edadMascota, String tipoMascota, String nombreProp) {
        NombreMascota = nombreMascota;
        EdadMascota = edadMascota;
        TipoMascota = tipoMascota;
        NombreProp = nombreProp;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public Integer getEdadMascota() {
        return EdadMascota;
    }

    public void setEdadMascota(Integer EdadMascota) {
        this.EdadMascota = EdadMascota;
    }

    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setTipoMascota(String TipoMascota) {
        this.TipoMascota = TipoMascota;
    }

    public String getNombreProp() {
        return NombreProp;
    }

    public void setNombreProp(String NombreProp) {
        this.NombreProp = NombreProp;
    }

    public void Mostrar(){

        System.out.println("Cual es el nombre de su mascota: " );
        input = new Scanner(System.in);
        NombreMascota = input.nextLine();
        System.out.println("Cual es la edad de su mascota: ");
        EdadMascota = input.nextInt();
        System.out.println("Que tipo de mascota tiene: ");
        TipoMascota = input.next();
        System.out.println("Cual es Su nombre: ");
        NombreProp = input.next();
        System.out.print("\033[H\033[2J");
        System .out.println(NombreMascota+" es un(a) "+TipoMascota+", el cual, tiene "+EdadMascota+" años de edad y "+NombreProp+" es actualmente su dueño(a).");
    }

}
