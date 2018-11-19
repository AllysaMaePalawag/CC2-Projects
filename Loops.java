package loops;
import java.util.Scanner;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Enter number to be guessed from 1-1000: ");
        int num1= sc.nextInt();
        
       System.out.println("............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n............................................."
                + "\n.............................................");
        
        while(true){
            
            System.out.println("Now Guess: ");                
            int num2=sc.nextInt();
            
           if(num2>num1 && num2<1000){
               
                if(num2%2 ==0){
                    System.out.println("Your number is even");
                }else{
                    System.out.println("Your number is odd");
                }
                System.out.println("LOWER!");
                
           }else if(num2<num1  && num2>0){
                 if(num2 % 2 ==0){
                    System.out.println("Your number is even");
                }else{
                    System.out.println("Your number is odd");
                }
                    System.out.println("HIGHER!");
       
           }else if(num2==num1){
               System.out.println("You guessed correct");
               break;
           
            }else if(num2<0 || num2>=1001){  
                    System.out.println("INVALID! Number must be lower than 1000");
           }
        }
        
     }  
}

