package fibonacci;

import java.util.Scanner;

public class Fibonacci {
        
    public static int number;
    public static int n;
    public static int i;
    public static int n1;
    public static int n2;
        
        public static void main(String[] args) {
            
            display();
        }
        
        public static int user(){
            
            Scanner sc= new Scanner (System.in);
            System.out.print("How many numbers do you want in a sequence? ");
            number= sc.nextInt();
            return number;              
        }
        
        public static int algorithm(int number){
            
            if (number<=1){
                return number;
            }else{
                return algorithm(number-1)+ algorithm (number-2);
            }
        }
        
        public static int display(){
            
            n2 = algorithm (user());
            for (int g=0;g<=n2;g++){
                System.out.print("f("+g+")\t");
            }
            System.out.println("");
            for (i=0;i<=n2;i++){
                for (n1=0;n1<=i;n1++){
                    System.out.print(algorithm(n1)+"\t");
                }
                System.out.println("");
            }
            return n2;            
        }
        
}
    

