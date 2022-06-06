package com.taller.ciclos;

public class DibujandoTriangulo {

    public void Dibujar(){
        for (int i = 0; i < 10; i++){
            for (int x = 0; x < i; x++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
