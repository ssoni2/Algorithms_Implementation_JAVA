package com.intern; 

public class MatrixRotate{
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrixR = new int[matrix.length][matrix[0].length];
		for(int i=0; i< matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
		for(int i=0; i< matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				matrixR[i][j] = matrix[matrix[i].length-1-j][i];
			}
		}
		for(int i=0; i< matrixR.length; i++){
			for (int j=0; j<matrixR[i].length; j++){
				System.out.print(matrixR[i][j]+" ");
			}
		System.out.println();
		}
		
	}
}