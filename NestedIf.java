package nestedif;

import java.util.*;

public class NestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter your Course \n"
                +"CHOICES: \n"
                + "[1]IT \n"
                + "[2]CS \n"
                + "[3] BSDA");
        String course = sc.nextLine();
        if(course.equals("IT")){
            System.out.println("What is your Major? \n"
                    + "CHOICES: \n"
                    + "[1] Network and Security\n"
                    + "[2] Web Development \n"
                    + "[3] Enterprice");
            String ITmin = sc.nextLine();
            
            if(ITmin.equals("Network and Security")){
                System.out.println("Your course is: "+course+" and your major is: "+ITmin);
            }else if(ITmin.equals("Web Development")){
                System.out.println("Your course is: "+course+" and your major is: "+ITmin);
            }else if(ITmin.equals("Enterprice")){
                System.out.println("Your course is: "+course+" and your major is: "+ITmin);
            }else{
                System.out.println("Error: Please Enter Prorper Name");
            } 
            
            
        }else if(course.equals("CS")){
            System.out.println("What is Your Major? \n"
                    + "CHOICES: \n"
                    + "[1] Animation \n"
                    + "[2] Mobile Development \n"
                    + "[3] Digital Arts");
            String CSmin = sc.nextLine();
            
            if(CSmin.equals("Animation")){
                System.out.println("Your course is: "+course+" and your major is: "+CSmin);
            }else if(CSmin.equals("Digital Arts")){
                System.out.println("Your course is: "+course+" and your major is: "+CSmin);
            }else if(CSmin.equals("Mobile Development")){
                 System.out.println("Your course is: "+course+" and your major is: "+CSmin);
            }else {
                System.out.println("Error: Please Enter Proper Name");
            }
            
            
        }else if(course.equals("BSDA")){
            System.out.println("BSDA");
        }else{
            System.out.println("Error");
        }
    }
    
}
