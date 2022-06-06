package com.taller.ciclos;
import java.util.Scanner;

public class Libreta {

    String nombre;
    String org;
    Integer tel;
    Integer opcion;
    
    Integer num1=300;
    Integer num2=310;
    Integer num3=301;

    String org1 ="Claro";
    String org2 ="Tigo";
    String org3 ="ETB";

    String nom1 = "Pedro";
    String nom2 = "Pablo";
    String nom3 = "Juan";

    Scanner input = new Scanner(System.in);

    public Libreta(String nombre, String org, Integer tel) {
        this.nombre = nombre;
        this.org = org;
        this.tel = tel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getTel() {
        return tel;
    }
    public void setTel(Integer tel) {
        this.tel = tel;
    }
    public String getOrg() {
        return org;
    }
    public void setOrg(String org) {
        this.org = org;
    }

    public void Administracion(){
        do{
            System.out.println("***Administracion de contactos****");
            System.out.println("Elija una opcion");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Para salir del sistema");
            System.out.println("**************************************");
            opcion = input.nextInt();
            System.out.print("\033[H\033[2J");
        switch (opcion){

            case 1:
                System.out.println("Digite el numero de contacto que desea añadir:");
                tel = input.nextInt();
                System.out.print("\033[H\033[2J");
                    if (tel.equals(num1) || tel.equals(num2) || tel.equals(num3)){
                        System.out.println("El numero de contacto ya exite.\n");
                    }else{
                        System.out.println("Digite nombre completo:");
                        nombre = input.next();
                        System.out.println("Digite el nombre de la organizacion:");
                        org = input.next();
                        System.out.print("\033[H\033[2J");
                        System.out.println("El numero de contacto se ha añadido correctamente. \n");
                }
            break;
            case 2:
                System.out.println("****Busqueda de contacto****");
                System.out.println("Digite el numero de contacto que desea buscar:");
                tel = input.nextInt();
                System.out.print("\033[H\033[2J");
                if(tel.equals(num1)){
                    System.out.println("Contacto: "+nom1);
                    System.out.println("Organizacion: "+org1);
                    System.out.println("Telefono: "+num1+"\n");
                }else{
                    System.out.println("Contacto no registrado.");
                }
                if(tel.equals(num2)){
                    System.out.println("Contacto: "+nom2);
                    System.out.println("Organizacion: "+org2);
                    System.out.println("Telefono: "+num2+"\n");
                }
                if(tel.equals(num3)){
                    System.out.println("Contacto: "+nom3);
                    System.out.println("Organizacion: "+org3);
                    System.out.println("Telefono: "+num3+"\n");
                }
            break;
            case 3:
                System.out.println("***Eliminar Contacto***");
                System.out.println("Digite el numero de Contacto que desea eliminar contacto");
                tel = input.nextInt();
                System.out.print("\033[H\033[2J");
                if(tel.equals(num1)){
                    System.out.println("Contacto: "+nom1);
                    System.out.println("Organizacion: "+org1);
                    System.out.println("Telefono: "+num1+"\n");
                    System.out.println("Contacto eliminado. \n");
                }else{
                    System.out.println("Contacto no registrado.");
                }
                if (tel.equals(num2)){
                    System.out.println("Contacto: "+nom2);
                    System.out.println("Organizacion: "+org2);
                    System.out.println("Telefono: "+num2+"\n");
                    System.out.println("Contacto eliminado. \n");
                }
                if(tel.equals(num3)) {
                    System.out.println("Contacto: "+nom3);
                    System.out.println("Organizacion: "+org3);
                    System.out.println("Telefono: "+num3+"\n");
                    System.out.println("Contacto eliminado. \n");
                }
                break;
            }
        }while (opcion != 4);
    }
}
