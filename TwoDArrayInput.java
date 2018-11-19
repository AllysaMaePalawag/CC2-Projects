package twodarrayinput;

import java.util.Scanner;

public class TwoDArrayInput{
    
    public static void main(String[] args){
       int row, col, i, j;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Number of Row for Array: ");
       row = scan.nextInt();
       System.out.print("Enter Number of Column for Array: ");
       col = scan.nextInt();
 
       int arr[][] = new int[row][col];   
       
       System.out.println("Enter " +(row*col)+ " Array Elements: ");
       for(i=0; i<row; i++){
           for(j=0; j<col; j++){
               arr[i][j] = scan.nextInt();
           }
       }
	   
       System.out.print("The Array is : \n");
       for(i=0; i<row; i++){
           for(j=0; j<col; j++){
               System.out.print(arr[i][j]+ "\t");
           }
           System.out.println();
       }
   }
}