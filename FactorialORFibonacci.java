package factorialorfibonacci;

import java.util.Scanner;

public class FactorialORFibonacci {
    
    public static Scanner sc;
    public static String cho;
    public static int index=0;
    public static int n1=0;
    public static int n2=1;
    public static int n;
    public static int[] element;
    
    public static void main(String[] args) {
        
        array();
        user();
    
        }
    
        public static void array(){
                
            System.out.println("=CREATE YOUR ARRAY=");
            sc = new Scanner(System.in);

            System.out.print("Array Index: ");
            index = Integer.parseInt(sc.nextLine());

            element = new int [index];

            System.out.println("Array Element: ");
            for (int i = 0; i < index; i++) {
                    int array=sc.nextInt();
                    element[i] = array;
            }
               
                
        }
        
        public static void user(){
            sc = new Scanner(System.in);
            System.out.print("Fibonacci or Factorial\n"
                    + "[1] Fibonacci\n"
                    + "[2] Factorial\n");
            
            cho= sc.nextLine();
            
            if(cho.equals("1")){
                displayFibo();
            }else if(cho.equals("2")){
                displayFact();
            }
            
        }
        
        public static void displayFibo(){
            
            System.out.print("Index:\t");
            for (int i=0; i<index; i++){
                System.out.print("\tF("+i+"): \t");
            }
            System.out.print("\nElements: ");
            for(int i=0; i<index;i++){
                System.out.print("\t"+element[i]+"\t");
            }
            System.out.print("\nFibonacci: ");
            for (int i=0;i<index;i++){
                System.out.print("\t"+algorithmFibo(element[i])+"\t");
                
            }
        }
        
        public static int algorithmFibo(int n){
            if (n<=1){
                return n;
            }else
                return algorithmFibo(n-1)+ algorithmFibo(n-2);
        }
        
        public static void displayFact(){
            
            System.out.print("Elements: \t");
            for (int i=0; i<index;i++){
                System.out.print(element[i]+"\t");
            }
            System.out.print("\nFibonacci: ");
            for (int i=0;i<index;i++){
                System.out.print("\t"+algorithmFact(element[i])+"\t");
            }
        
        }public static int algorithmFact(int n){
                
            if (n >= 1){
                return n * algorithmFact(n - 1);
            }else{
                return 1;
            }
        }
        
    }
    

