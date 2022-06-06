package com.taller.condicionales;
import java.util.Scanner;

public class Tienda {

    private String usuario;
    private static Scanner input;
    private Boolean salir = false;
    private Integer opcion;
    private String novedad;

    public Tienda(String usuario,  String novedad) {
        this.usuario = usuario;  
        this.novedad = novedad;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNovedad() {
        return novedad;
    }
    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }
    
    public void Mostrar(){
        String pelicula1 = "Shrek";
        String pelicula2 = "Madagascar";
        String pelicula3 = "Nemo";

        do{
            System.out.println("***********************************************");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Alquilar película");
            System.out.println("2. Consultar películas disponibles");
            System.out.println("3. Recibir película");
            System.out.println("4. Para salir");
            System.out.println("***********************************************");
            input = new Scanner(System.in);
            opcion = input.nextInt();
            System.out.print("\033[H\033[2J");

            switch(opcion){
                case 1:
                    System.out.println("Elija una opcion para alquilar pelicula");
                    System.out.println("1."+pelicula1+" El costo del alquiler es de $5000");
                    System.out.println("2."+pelicula2+" El costo del alquiler es de $6000");
                    System.out.println("3."+pelicula3+" El costo del alquiler es de $7000");
                    input = new Scanner(System.in);
                    opcion = input.nextInt();
                    System.out.print("\033[H\033[2J");

                    switch (opcion) {
                        case 1:
                        System.out.println("Haz alquilado la pelicula "+pelicula1+" Disfrutala!\n");
                        break;
                        case 2:
                        System.out.println("Haz alquilado la pelicula "+pelicula2+" Disfrutala!\n");
                        break;
                        case 3:
                        System.out.println("Haz alquilado la pelicula "+pelicula3+" Disfrutala!\n");
                        break;
                    } 
                    break;
                case 2:
                    System.out.println("Las peliculas disponibles son: \n");
                    System.out.println("1."+pelicula1+" El costo del alquiler es de $5000");
                    System.out.println("2."+pelicula2+" El costo del alquiler es de $6000");
                    System.out.println("3."+pelicula3+" El costo del alquiler es de $7000\n");
                break;
                case 3:

                    System.out.println("¿Desea registrar novedad? Elija una opcion.");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion = input.nextInt();
                    System.out.print("\033[H\033[2J");
                    switch(opcion){
                        case 1:
                            System.out.println("Escriba la novedad de la pelicula: ");
                            input = new Scanner(System.in);
                            novedad = input.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.println("Novedad registrada!\n");
                        break;
                        case 2:
                            System.out.println(salir);
                            System.out.print("\033[H\033[2J");
                    }
                    break;
            }     
        }while(opcion !=4);
    }   
}
