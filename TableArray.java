package tablearray;
import java.util.*;

public class TableArray {

    public static void main(String[] args) {
    
        int[] array = {3,9,15,20,65,23,18,4,2,14,21};
        ArrayList<Integer> even= new ArrayList<Integer>();
        ArrayList<Integer> odd= new ArrayList<Integer>();
        
        
        for (int i = 0; i < array.length ; i++){
            if(array[i]%2==0){
                even.add(array[i]); 
            }
            else if(array[i]%2!=0){
                odd.add(array[i]);               
            }   
    }
        
        System.out.println("Even: \t Odd:");
        
            for(int x=0; x < array.length; x++){
                
                if(x<odd.size()&& x>=even.size()){
                    System.out.println("\t"+odd.get(x));
                
                }else if(x>=odd.size() && x<even.size()){
                    System.out.println("\t"+even.get(x));
                
                }else if(x<odd.size()){
                   System.out.println(even.get(x)+"\t"+odd.get(x)); 
                }
                
            }
    }
}
