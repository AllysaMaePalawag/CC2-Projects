/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Scanner;
/**
 *
 * @author M306User
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter username: ");
        String name= sc.nextLine();
        System.out.print("Enter password: ");
        String password= sc.nextLine();
        System.out.print("Verification of the Password: ");
        String veri= sc.nextLine();
        
        if (veri.equals (password)){
            System.out.println("Correct Password");
           
        } else {
            System.out.println("Invalid Password");
        }
        
        
    }
    
}
