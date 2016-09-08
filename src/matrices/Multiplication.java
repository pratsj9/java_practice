package matrices;

import java.util.Scanner;

public class Multiplication {
	
	int [][] arr1 ;
	int [][] arr2;
	int [][] arr3;
	static int rows_A;
	static int cols;
	static int cols_B;
	
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Multiplication m1 = new Multiplication();
		
		System.out.println("\n\tEnter the size of the Matrices A and B");
		System.out.println("\n\tRows: for A Matrice");
		rows_A = scn.nextInt();
		System.out.println("\n\tColumns: for A which will be rows in B Matrice ");
		cols = scn.nextInt();
		System.out.println("\n\tColumns: for B Matrice ");
		cols_B = scn.nextInt();
		
		System.out.println("Enter "+(rows_A * cols)+" Elements for both matrices");
		System.out.println("\n\t Enter matrice A data:");
		for(int i = 0;i <rows_A ;i++)
		{
			for (int j=0;j<cols;j++)
			{
				m1.arr1[i][j]=scn.nextInt();
				
			}
		}
		System.out.println("\n\t Enter matrice B data:");
		for(int i = 0;i <cols ;i++)
		{
			for (int j=0;j<cols_B;j++)
			{
				m1.arr2[i][j]=scn.nextInt();
				
			}
		}
		System.out.println("\n\t Output matrice");

		for (int i=0;i<rows_A;i++)   //Rows in A Matrice
		{
			for(int j=0;j<cols;j++)  	//Columns in B Matrice
			{
				for (int k=0;k<rows_A;k++)
				{
					
				m1.arr3[i][j] = m1.arr3[i][j] + (m1.arr1[i][k]*m1.arr2[k][j]);	
				}
			
			}
			
		}
		for(int i = 0;m1.arr3.length <cols ;i++)
		{
			for (int j=0;j<m1.arr3[0].length;j++)
			{
				System.out.println("\n\t"+m1.arr3[i][j]+" ");
				
			}
		}
		
		
		
	
	
	scn.close();
	}
	
}
