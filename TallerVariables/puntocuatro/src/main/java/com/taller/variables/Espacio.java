package com.taller.variables;
import java.util.Scanner;


class Espacio {
    private String pais;
    private String ciudad;
    private static Scanner input;

    public Espacio(String pais, String ciudad){
        this.pais = pais;
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }
 
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void Mostrar(){
        System.out.println("En que país vive: " );
        input = new Scanner(System.in);
        pais = input.nextLine();
        System.out.println("Cual es la ciudad capital del pais donde vive: ");
        ciudad = input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("La ciudad "+ciudad+" Es la capital del país "+pais);
    }

}
