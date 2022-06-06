package com.taller.arreglos;

public class Matriz {
    
    static int[][] quemarMatriz = new int[4][5];
 
    public void Mostrar(){
        quemarMatriz[0][0] = 1;
        quemarMatriz[0][1] = 2;
        quemarMatriz[0][2] = 3;
        quemarMatriz[0][3] = 4;
        quemarMatriz[0][4] = 5;
        quemarMatriz[1][0] = 6;
        quemarMatriz[1][1] = 7;
        quemarMatriz[1][2] = 8;
        quemarMatriz[1][3] = 9;
        quemarMatriz[1][4] = 10;
        quemarMatriz[2][0] = 11;
        quemarMatriz[2][1] = 12;
        quemarMatriz[2][2] = 13;
        quemarMatriz[2][3] = 14;
        quemarMatriz[2][4] = 15;
        quemarMatriz[3][0] = 16;
        quemarMatriz[3][1] = 17;
        quemarMatriz[3][2] = 18;
        quemarMatriz[3][3] = 18;
        quemarMatriz[3][4] = 20;

        for (int fil = 0; fil < 4; fil++) {

            if (fil % 2 != 0) {
                for (int colum = 4; colum >= 0; colum--) {
                    System.out.print((quemarMatriz[fil][colum] <= 9 ? "0" + quemarMatriz[fil][colum] : quemarMatriz[fil][colum]) + " ");
                }
            }
            if (fil % 2 == 0) {
                for (int colum = 0; colum < 5; colum++) {
                    System.out.print((quemarMatriz[fil][colum] <= 9 ? "0" + quemarMatriz[fil][colum] : quemarMatriz[fil][colum]) + " ");
                }
            }
            System.out.println("");
        }
    }
}
