package com.taller.ciclos;

public class DibujarTrianguloRev {
    
    public void Dibujar(){
        for (int i = 0; i < 10; i++){
            for(int j = 10; j > i; j--){
                System.out.print(" "); 
            }
            for(int x = 0; x < i; x++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
