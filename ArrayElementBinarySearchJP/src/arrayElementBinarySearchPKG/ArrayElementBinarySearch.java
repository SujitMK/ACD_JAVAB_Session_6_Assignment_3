package arrayElementBinarySearchPKG;                        // Package declared

import java.util.Scanner;

// This class is used to search an array element 
 
public class ArrayElementBinarySearch {                            // class defined

	public static void main(String[] args) {                         // main method
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);                    // using Scanner to take the dynamic input
		
		System.out.println("Enter Number Of Array Elements: ");            // printing info
		 
		int n = input.nextInt();                                   //taking no od elements from user
		
		int array[] = new int[n];                                  // creating an array of size n
		
		System.out.println("Enter "+n+" Array Elements: ");            // printing info
		
		for(int i=0; i < n; i++)                                   // for loop to create an array
		{
			array[i] = input.nextInt();                           // creating an array elements
		}
		
		System.out.println("Enter Array Element To Find :  ");            // printing info
		int search = input.nextInt();                                 // taking a array element to find
		
		for(int j=0; j < array.length; j++)                           // for loop to search element
		{
			if(array[j] == search)                                     // searching an array element in array
			{
				System.out.println("Array Element Found At Array Index : Array["+j+"]");    // printing if array is found
			}
		}
		
		input.close();

	}

}
