package com.taller.arreglos;

public class ListaRan {


    public void Mostrar(){
        int[] arreglo = new int [20];
        for(int i=0; i<arreglo.length; i++){
            arreglo[i] = (int) Math.floor(Math.random() *(100 - 1)) + 1;
        }
        System.out.println("Números Impares: \n");
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] %2 != 0){
                System.out.println(" "+arreglo[i]);
            }
        }
        System.out.println("\n Numeros Pares:  \n");
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] %2 == 0){
                System.out.println(" "+arreglo[i]);
            }
        }
    }
}
