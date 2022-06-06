package com.taller.condicional;
import java.util.Scanner;

public class Area {

    Double alturaRectangulo;
    Double baseRectangulo;
    Double alturaTriangulo;
    Double baseTriangulo;
    Double lado1;
    Double lado2;
    Double lado3;
    Integer opcion;
    static Scanner input= new Scanner(System.in);

    public Area(Double alturaRectangulo, Double baseRectangulo, Double alturaTriangulo, Double baseTriangulo,
            Double lado1, Double lado2, Double lado3) {
        this.alturaRectangulo = alturaRectangulo;
        this.baseRectangulo = baseRectangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public Double getAlturaRectangulo() {
        return alturaRectangulo;
    }

    public void setAlturaRectangulo(Double alturaRectangulo) {
        this.alturaRectangulo = alturaRectangulo;
    }
    public Double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(Double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;

    }
    public Double getBaseRectangulo() {
        return baseRectangulo;
    }

    public void setBaseRectangulo(Double baseRectangulo) {
        this.baseRectangulo = baseRectangulo;
    }
    public Double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(Double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }
    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }
    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }
    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public void Calculando(){
        do{
        System.out.println("*** Aplicacion para calcular area a rectangulo, tríangulo o trapecio ***");
        System.out.println("Elija una opcion:");
        System.out.println("1. Calcular el area a un rectangulo");
        System.out.println("2. Calcular el area a un tríangulo");
        System.out.println("3. Calcular el area a un trapecio");
        System.out.println("*******************************************");
        opcion = input.nextInt();
        System.out.print("\033[H\033[2J");

        switch (opcion) {
            case 1:
                System.out.println("Calcular area de un rectangulo.");
                System.out.println("Cual es la altura del rectangulo?");
                alturaRectangulo = input.nextDouble();
                System.out.println("Cual es la base del rectangulo?");
                baseRectangulo = input.nextDouble();
                System.out.println("El area del rectangulo es: "+baseRectangulo*alturaRectangulo);
            break;
            case 2:
                System.out.println("Calcular el area de un Tríangulo.");
                System.out.println("Cual es la altura del tríngulo?");
                alturaTriangulo = input.nextDouble();
                System.out.println("Cual es la base del tríngulo?");
                baseTriangulo = input.nextDouble();
                System.out.println("El area del tríngulo es: "+ (baseTriangulo*alturaTriangulo)/2);              
            break;
            case 3:
            System.out.println("Calcular el area de un trapecio.");                
            System.out.println("Cuanto mide el lado superior?");
            lado1 = input.nextDouble();
            System.out.println("Cuanto mide la base del trapecio?");
            lado2 = input.nextDouble();
            System.out.println("Cuanto mide h?");
            lado3 = input.nextDouble();
            System.out.println("El area del trapecio es: "+((lado1 + lado2)*lado3));
            }
        }while (opcion !=4);
    }
}
