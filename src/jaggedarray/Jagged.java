//Program to implement Jagged Array Using Enhanced And Basic For loop
package jaggedarray;


public class Jagged {


public static void main(String args[])
	{
	
	int [] arr = {15};
	int [] arr2={15,25};
	int [] arr3 = {16,46,88};
	int [][] j_arr = new int[3][];
	j_arr[0]=arr;
	j_arr[1]=arr2;
	j_arr[2]=arr3;

	
	for(int i=0;i<j_arr.length;i++)
	{
		
	for(int j=0;j<j_arr[i].length;j++)
	
	{
		System.out.print(j_arr[i][j]+" ");
		
	
	}System.out.println();
		
		
	}
	
	

	}
}
