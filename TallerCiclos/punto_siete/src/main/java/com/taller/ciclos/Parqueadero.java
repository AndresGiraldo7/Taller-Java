package com.taller.ciclos;
import java.util.Scanner;

public class Parqueadero {
    private String placa;
    private String nombre;
    private String marca;
    Integer opcion;
    Scanner input = new Scanner(System.in);
     
    String placa1 ="ovl598";
    String placa2 = "afs456";
    String placa3 = "axc966";
    String placa4 = "dad868";
    String placa5 = "dfy868";

    String marca1 = "Toyota";
    String marca2 = "Ford";
    String marca3 = "Chevrolet";

    String nom1 = "Juan";
    String nom2 = "Pedro";
    String nom3 = "Laura";
    String nom4 = "Pablo";
    String nom5 = "Maria";
    
    String tel1 = "564867";
    String tel2 = "487669";
    String tel3 = "789754";
    String tel4 = "853254";
    String tel5 = "215463";
    
    public Parqueadero(String placa, String nombre, String marca) {
        this.placa = placa;
        this.nombre = nombre;
        this.marca = marca;
    }
  
    /**
     * @return String return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

   

public void Administracion(){

    do{
        
        System.out.println("*****Parqueadero el guardian****");
        System.out.println("Placas de Vehiculos parquedos actualmente: ovl598, afs456, axc966, dad868, dfy868 ");
        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Retirar vehiculo");
        System.out.println("3. Consultar vehiculo");
        System.out.println("4. Para salir");
        System.out.println("**************************************");
        opcion =input.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println("Vehiculos parquedos actualmente: ovl598, afs456, axc966, dad868, dfy868 \n ");
    switch (opcion){

            case 1:

                System.out.println("Digite la placa del vehiculo para el registro: ");
                placa = input.next();
                System.out.print("\033[H\033[2J");
                if (placa.equals(placa1) || placa.equals(placa2) || placa.equals(placa3) || placa.equals(placa4) || placa.equals(placa5)){
                    System.out.println("El vehiculo ya esta registrado.");
                }else{
                    System.out.println("Digite su nombre:");
                    nombre = input.next();
                    System.out.println("Digite marca del vehiculo");
                    marca = input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.println("Se han guardado sus datos para el registro.\n");
                    System.out.println("Lo sentimos cupo del parqueadero lleno.");
                }
            break; 
            case 2:
                System.out.println("Digite la placa del vehiculo que desea retirar");
                placa = input.next();
                System.out.print("\033[H\033[2J");
                if (placa.equals(placa1)){
                    System.out.println("Vehiculo con placas: "+placa1+" Marca "+marca1+" Propiedad de :"+nom1+" Telefono "+tel1+".\n");
                    System.out.println("Vehiculo retirado exitoxamente.\n");
                }else{
                    System.out.println("Vehiculo no registrado.");
                }
                if (placa.equals(placa2)){
                    System.out.println("Vehiculo con placas: "+placa2+" Marca "+marca2+" Propiedad de :"+nom2+" Telefono "+tel2+".\n");
                    System.out.println("Vehiculo retirado exitoxamente.\n");
                }
                if (placa.equals(placa3)){
                    System.out.println("Vehiculo con placas: "+placa3+" Marca "+marca3+" Propiedad de :"+nom3+" Telefono "+tel3+".\n");
                    System.out.println("Vehiculo retirado exitoxamente.\n");
                }

                if (placa.equals(placa4)){
                    System.out.println("Vehiculo con placas: "+placa4+" Marca "+marca1+" Propiedad de :"+nom4+" Telefono "+tel4+".\n");
                    System.out.println("Vehiculo retirado exitoxamente.\n");
                }
                if (placa.equals(placa5)){
                    System.out.println("Vehiculo con placas: "+placa5+" Marca "+marca2+" Propiedad de :"+nom5+" Telefono "+tel5+".\n");
                    System.out.println("Vehiculo retirado exitoxamente.\n");
                }
                break;
            case 3:
            System.out.println("Digite la placa del vehiculo que desea retirar");
            placa = input.next();
            if (placa.equals(placa1)){
                System.out.println("Vehiculo con placas: "+placa1+" Marca "+marca1+" Propiedad de :"+nom1+" Telefono "+tel1+".\n");
            }else {
                System.out.println("Vehiculo no registrado.");
            }
            if (placa.equals(placa2)){
                System.out.println("Vehiculo con placas: "+placa2+" Marca "+marca2+" Propiedad de :"+nom2+" Telefono "+tel2+".\n");
              
            }
            if (placa.equals(placa3)){
                System.out.println("Vehiculo con placas: "+placa3+" Marca "+marca3+" Propiedad de :"+nom3+" Telefono "+tel3+".\n");
                
            }

            if (placa.equals(placa4)){
                System.out.println("Vehiculo con placas: "+placa4+" Marca "+marca1+" Propiedad de :"+nom4+" Telefono "+tel4+".\n");
                
            }
            if (placa.equals(placa5)){
                System.out.println("Vehiculo con placas: "+placa5+" Marca "+marca2+" Propiedad de :"+nom5+" Telefono "+tel5+".\n");            
            }
            break;
            }
        }while(opcion != 4);
    }
}
