package com.taller.condicionales;
import java.util.Scanner;

public class Imc {
  
    String usuario;
    Double peso;
    Double estatura;
    Double calculoImc;
    static Scanner input =new Scanner(System.in);;

    public Imc(String usuario, Double peso, Double estatura, Double calculoImc) {
        this.usuario = usuario;
        this.peso = peso;
        this.estatura = estatura;
        this.calculoImc = calculoImc;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public Double getCalculoImc() {
        return calculoImc;
    }
    public void setCalculoImc(Double calculoImc) {
        this.calculoImc = calculoImc;
    }
    
    public void Calculando(){
        System.out.println("*** Bienvenido a  La Secretaria de Salud Municipal ***");
        System.out.println("Sistema Para calcula tu indice de masa corporal");
        System.out.println("Digita tu nombre");
        usuario = input.nextLine();
        System.out.println("Cual es tu peso en Kilogramos:");
        peso = input.nextDouble();
        System.out.println("Cual es tu estatura en Metros(Ej: 1,75):");
        estatura = input.nextDouble();
        System.out.print("\033[H\033[2J");
        calculoImc = peso /Math.pow(estatura,2);
        System.out.println("Tu indice de masa corporal "+usuario+" es:"+ calculoImc);

            if(calculoImc <= 18.5){
            System.out.println("Tienes un peso bajo.");
            }

            if(calculoImc >= 18.8){
            System.out.println("Tienes un buen peso.");
            }

            if(calculoImc >= 25 ){ 
            System.out.println("Estas en sobrepeso");
            }

            if(calculoImc >= 35){
            System.out.println("Estas obeso");
            }

        }         

    }

    

