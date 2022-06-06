package com.taller.arreglos;
import java.util.Scanner;

public class Llenar {

    Scanner input = new Scanner(System.in);
    
    public void Completar(){
        int[] vector = new int[5];
        for(int i =0; i < vector.length; i++){
            System.out.println((i+1)+"- Digite numero para completar el vector.");
            vector[i] = input.nextInt();
        }
        for (int i =0; i < vector.length; i++){
            System.out.println("["+i+"] = "+vector[i]);
        }
    }
}
