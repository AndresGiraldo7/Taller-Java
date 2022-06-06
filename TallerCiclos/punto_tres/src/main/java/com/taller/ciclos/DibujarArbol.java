package com.taller.ciclos;

public class DibujarArbol {

    public void Dibujar(){
        for(int i=0; i < 16; i++){

            if(i<12){
                for (int x = 11; x > i; x--){
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                    if(j>0){
                        System.out.print("*");
                    }
                }
            }

            if(i>= 14){
                for(int x = 11; x > i -11; x--){
                if(i - 12 < 1 && x == 10){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i - 11; j++){
                System.out.print("*");
                if (i - 12 < 1 ){
                    System.out.print("**");
                }
                if(j > 0){
                    System.out.print("*");
                    }
                }
            }   
            System.out.println("");
        }    
    }
}