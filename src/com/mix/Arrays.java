package com.mix;

public class Arrays {
    public static void main(String[] args) {
      int[] arr = new int[5];
        int[] reverseArr = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 14;
        arr[3] = 16;
        arr[4] = 18;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[arr.length - i - 1] = arr[i];
        }

        for (int j = 0; j <= reverseArr.length - 1; j++) {
            System.out.print(reverseArr[j] + " ");

        }
        // Multidimensional arrays

        // example 1
        /*int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };   // int[][]matrix=new int[][] ==> matrix[0][0]=1, matrix[0][1]=2, .........., matrix[3][2]=12;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
*/
        // example 2

       /* int[][] mat = new int[3][4];
        int number = 1;

        for (int x = 0; x < mat.length; x++) {
            int[] row = mat[x];

            for (int y = 0; y < row.length; y++) {
                row[y] = number;
                number++;
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        // example 2 another solution way:
        int[][] matrix = new int[3][4];
        int numb = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numb;
                numb++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}


