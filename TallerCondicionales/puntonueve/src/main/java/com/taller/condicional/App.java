package com.taller.condicional;

public class App {

    private static Double alturaRectangulo;
    private static Double baseRectangulo;
    private static Double alturaTriangulo;
    private static Double baseTriangulo;
    private static Double lado1;
    private static Double lado2;
    private static Double lado3;

    public static void main( String[] args ){
       
        Area area = new Area(alturaTriangulo, baseTriangulo, alturaRectangulo, baseRectangulo, lado1, lado2, lado3);
        area.Calculando();
    }
}
