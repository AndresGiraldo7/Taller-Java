package com.taller.condicionales;
import java.util.Scanner;

public class Maquinista {
    String moto;
    String cliente;
    String observacion;
    String arreglo;
    String salida;
    Integer opcion;
    static Scanner input;
  
    public Maquinista(String moto, String cliente, String observacion, String arreglo, String salida) {
        this.moto = moto;
        this.cliente = cliente;
        this.observacion = observacion;
        this.arreglo = arreglo;
        this.salida = salida;
    }
    public String getMoto() {
        return moto;
    }
    public void setMoto(String moto) {
        this.moto = moto;
    }
    
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public String getArreglo() {
        return arreglo;
    }
    public void setArreglo(String arreglo) {
        this.arreglo = arreglo;
    }
    public String getSalida() {
        return salida;
    }
    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void Mostrar(){
        String servicio1="Mantenimiento General de Motocicleta";
        String servicio2="Mantenimiento Periodico de la Motocicleta";
        String servicio3="Lavado de Motocicleta";
        String mecanico ="Rafael";

        do{
        System.out.println("*** Bienvenido a El Maquinista taller de motos ***");
        System.out.println("Digite su nombre: ");
        input = new Scanner(System.in);
        cliente = input.nextLine();
        System.out.println("Digite la placa de su Motocicleta: ");    
        moto= input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Elija una opcion: ");
        System.out.println("1. Registrar servicio para motocicleta. ");
        System.out.println("2. Observaciones por parte del cliente.");
        System.out.println("3. Registro de salida de la motocicleta.");
        System.out.println("4. Inventario de cambio por parte del mecanico");
        System.out.println("5. Para salir");
        System.out.println("******************************************************");
        input = new Scanner(System.in);
        opcion = input.nextInt();
        System.out.print("\033[H\033[2J");

        switch (opcion){

            case 1:
                System.out.println("Elija un servicio para su motocicleta:");
                System.out.println("1. "+servicio1);
                System.out.println("2. "+servicio2);
                System.out.println("3. "+servicio3);
                input = new Scanner(System.in);
                opcion = input.nextInt();
                System.out.print("\033[H\033[2J");
                if(opcion == 1){
                    System.out.println("El servicio se "+servicio1+" quedo registrado exitosamente para el cliente "+cliente+" propietario de la moto con placas "+moto+"\n");
                }
                if(opcion == 2){
                    System.out.println("El servicio se "+servicio2+" quedo registrado exitosamente para el cliente "+cliente+" propietario de la moto con placas "+moto+"\n");
                }
                if(opcion == 3){
                    System.out.println("El servicio se "+servicio3+" quedo registrado exitosamente para el cliente "+cliente+" propietario de la moto con placas "+moto+"\n");
                }
            break;

            case 2:
                System.out.println("Por favor escriba las observaciones que desea realizar:");
                input = new Scanner(System.in);
                observacion = input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.println("Observacion guardada \n");
            break;

            case 3:
                System.out.println("Digite lafecha de salida del taller: ");
                input = new Scanner(System.in);
                salida = input.nextLine();
                System.out.print("La moto con placas "+moto+" fue retirada en la fecha: "+salida+"\n");
            break;

            case 4:
                System.out.println("Por favor escriba los cambios o arreglos que se deben realizar a la motocicleta:");
                input = new Scanner(System.in);
                arreglo = input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.println("Inventado realizado por el mecanico"+mecanico+" guardado");
            break;
            }
        }while (opcion !=5);
    }
}


