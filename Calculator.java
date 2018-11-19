package c0000des;
import java.util.Scanner;

public class C0000des {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Hello, I am a calculator!");
        System.out.println("What can i solve for you, today?");
        System.out.println("\nAddition or +"
                + "\nSubtraction or -"
                + "\nMultiplication or *"
                + "\nDivision or /"
                + "\nModula or %");
        System.out.print("ENTER CHOICE:");
        String cho=sc.nextLine();
        
        int num=0;
        int num2=0;
        int ans=0;
        
        if(cho.equals("Addition")||cho.equals("+")){
            System.out.print("num1: ");
            num=sc.nextInt();
            System.out.print("num2: ");
            num2=sc.nextInt();
            ans=num+num2;
            System.out.println("SOLUTION & ANSWER:"
                    + "\n"+num+" + "+num2+" = "+ans);
        }else if(cho.equals("Subtraction")||cho.equals("-")){
            System.out.print("num1: ");
            num=sc.nextInt();
            System.out.print("num2: ");
            num2=sc.nextInt();
            ans=num-num2;
            System.out.println("SOLUTION & ANSWER:"
                    + "\n"+num+" - "+num2+" = "+ans);
        }else if(cho.equals("Multiplication")||cho.equals("*")){
            System.out.print("num1: ");
            num=sc.nextInt();
            System.out.print("num2: ");
            num2=sc.nextInt();
            ans=num*num2;
            System.out.println("SOLUTION & ANSWER:"
                    + "\n"+num+" * "+num2+" = "+ans);
        }else if(cho.equals("Division")||cho.equals("/")){
            System.out.print("num1: ");
            num=sc.nextInt();
            System.out.print("num2: ");
            num2=sc.nextInt();
            ans=num/num2;
            System.out.println("SOLUTION & ANSWER:"
                    + "\n"+num+" / "+num2+" = "+ans);
        }else if(cho.equals("Modula")||cho.equals("%")){
            System.out.print("num1: ");
            num=sc.nextInt();
            System.out.print("num2: ");
            num2=sc.nextInt();
            ans=num%num2;
            System.out.println("SOLUTION & ANSWER:"
                    + "\n"+num+" % "+num2+" = "+ans);
        }else{
            System.err.println("ERROR");
        }
    }
    
}
