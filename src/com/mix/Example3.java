package com.mix;
// multidimensional arrays girilen matrisi ekrana yazdırma
public class Example3 {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {4, 5, 4},
                {5, 1, 9},
        };
        for(int i=0; i< matris.length; i++){
            for (int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}

