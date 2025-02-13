//
package basic_Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElements 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size..");
		int size = s.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter Elements One by One");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.print("Array Elements:- " + Arrays.toString(arr)+" ");
		
		System.out.println("Elements in Reverse Order...");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
