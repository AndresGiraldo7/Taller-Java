package com.taller.condicionales;
import java.util.Scanner;
public class Fabrica {

    public void Mostrar(){

    Integer opcion;
    Scanner input = new Scanner(System.in);

    String torta1="Torta para cumpleaños";
    String torta2="Torta para Matrimonios";
    String torta3="Torta para 15 años";

    String sabor1 ="Chocolate";
    String sabor2 ="Vinilla";
    String sabor3 = "Tres leches";

    String cantidad1 = "6 porciones";
    String cantidad2 = "12 porciones";
    String cantidad3 = "18 porciones";
    
    String decorado1 = "Decorada.";
    String decorado2 = "No decorada.";

    do{
        System.out.println("Elija una opcion: ");
        System.out.println("1. Registrar pedido");
        System.out.println("2. Tortas Disponibles");
        System.out.println("3. Tortas vendidas");
        opcion = input.nextInt();
        System.out.print("\033[H\033[2J");
        switch (opcion) {
            case 1: 
            System.out.println("Registrar Producto");
            System.out.println("1. "+torta2+" "+sabor1+" "+cantidad2+" "+decorado1);
            System.out.println("2. "+torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println("3. "+torta3+" "+sabor3+" "+cantidad3+" "+decorado1);
            opcion = input.nextInt();
            System.out.print("\033[H\033[2J");
            if(opcion == 1) {
            System.out.println("Se registro "+torta2+" "+sabor1+" "+cantidad2+" "+decorado1+"\n");
            }
            if(opcion == 2) {
            System.out.println("Se registro "+torta1+" "+sabor2+" "+cantidad1+" "+decorado2+"\n");
            }
            if(opcion == 3) {
            System.out.println("Se registro "+torta3+" "+sabor3+" "+cantidad3+" "+decorado1+"\n");
            }
            break;
            case 2:
                System.out.println("Las tortas Disponibles son: ");
                System.out.println(torta2+" "+sabor1+" "+cantidad2+" "+decorado1);
                System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
                System.out.println(torta2+" "+sabor3+" "+cantidad3+" "+decorado1+"\n");
            break;
            case 3:
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println(torta2+" "+sabor1+" "+cantidad2+" "+decorado1);
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println(torta2+" "+sabor3+" "+cantidad3+" "+decorado1);
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println(torta2+" "+sabor1+" "+cantidad2+" "+decorado1);
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2);
            System.out.println(torta2+" "+sabor3+" "+cantidad3+" "+decorado1);
            System.out.println(torta1+" "+sabor2+" "+cantidad1+" "+decorado2+"\n");
            break;
            }
        }while (opcion != 4);
    }
}
