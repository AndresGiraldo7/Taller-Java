package com.taller.condicionales;
import java.util.Scanner;


public class Banco {
    Integer cantidad;
    String titular;
    Integer opcion;
    static Scanner input = new Scanner(System.in);
    Integer cantidadC =  800000;

    public Banco(String titular,Integer cantidad) {
        this.cantidad = cantidad;
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
   
    public void Control(){
     
            System.out.println("Digite el nombre del titular de la cuenta");
            titular = input.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.println("Elija una opcion "+titular );
            System.out.println("1. Realizar un ingreso");
            System.out.println("2. Realizar un retiro");
            System.out.println("3. Consultar valor de los productos");
            opcion = input.nextInt();
       
            System.out.print("\033[H\033[2J");
         switch (opcion){

            case 1:
                System.out.println("Bienvenido a la seccion de ingresos "+ titular);
                System.out.println("¿Cual es la cantidad de dinero que desea ingresar?");
                cantidad = input.nextInt();
                    if (cantidad < 0){
                        System.out.println("Digite una cantidad positiva");
                    }
                    if (cantidad > 0){
                        System.out.println("Ha realizado el ingreso de "+cantidad+" pesos"+" Gracias por usar nuestros servicios.");
                    }
            break;

            case 2:
                System.out.println("Bienvenido a la seccion de retiros "+ titular);
                System.out.println("¿Cual es la cantiad de dinero que desea retirar?");
                cantidad = input.nextInt();
                    if ( cantidad <= cantidadC){
                        System.out.println("Ha realizado el retiro de  "+cantidad+" pesos"+ " gracias por usas nuestros servicios.");
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
            break;
            case 3:
                System.out.println("Elije una opcion");
                System.out.println("1. Consultar el costo de ingreso");
                System.out.println("2. Consultar el costo de retiro");
                opcion = input.nextInt();
                System.out.print("\033[H\033[2J");
                switch ( opcion){
                    case 1:
                        System.out.println(titular+" El costo de ingreso es de 0 pesos");
                        break;
                    case 2:
                        System.out.println(titular+" El costo del retiro es de 4.000 pesos");
                        break;
                }
        } 
     
    }

}
