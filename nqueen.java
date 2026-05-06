package com.shriram;

public class nqueen {

    static int count = 0;

    public static void printMatrix(char arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char arr[][], int row, int col){
        for(int i = row-1; i >= 0; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1, j = col+1; i >= 0 && j < arr.length; i--, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueen(char arr[][], int row){
        if(row == arr.length){
            printMatrix(arr);
            count++;
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                nQueen(arr, row + 1);
                arr[row][i] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = '.';
            }
        }
        nQueen(arr, 0);
        System.out.println(count);
    }
}
