package com.taller.arreglos;
import java.util.Scanner;
public class Matriz {
    int[][] matriz = new int[10][10];
    int fila, columna;
    static Scanner num = new Scanner(System.in);
    
    public int[][] Multiplicar(){
     
        System.out.print("Columnas ");
        for (int i = 0; i < 10; i++) {
                System.out.print("|    " +i+"    |");
        }
        System.out.print("\nFilas");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print("|   "+i+"   |");
                }
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print("| " + (i < 9 ? "0" + (i + 1) + " x " : (i + 1) + " x ") + ((j < 9 ? "0" + (j + 1) : (j + 1))) + " |");
            }
            System.out.println("");
        }
        return matriz;  
    }

    public void Menu(int[][] matriz){
        

        System.out.print("\nDigite la fila que va a multiplicar: ");
        fila = num.nextInt();
        System.out.print("Digite la columna que va a multiplicar con la fila que selecciono: ");
        columna = num.nextInt();

        System.out.println("\nEl resultado de la multiplicacion es: "+matriz[fila][columna]+".");
    }
}
