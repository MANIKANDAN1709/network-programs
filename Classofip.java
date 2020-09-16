import java.util.*; 



public class Classofip {
    static String findClass(String str){ 
        // Calculating first occurrence of '.' in str 
        int index = str.indexOf('.'); //4
        // First octate in str in decimal form 
        String ipsub = str.substring(0,index); //152.168.2.1
        int ip = Integer.parseInt(ipsub); //convert to integer value
        // Class A 
        if (ip>=1 && ip<=126) 
            return "A"; 
        // Class B 
        else if (ip>=128 && ip<=191) 
            return "B"; 
        // Class C 
        else if (ip>=192 && ip<223) 
            return "C"; 
        // Class D 
        else if (ip >=224 && ip<=239) 
            return "D"; 
        // Class E 
        else
            return "E"; 
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a ip address: ");  
        String str= sc.nextLine();  
       //String str= "152.122.01.13";
       System.out.println(" \n The ip address given is " + str+"\n");
       String classofip = findClass(str);
       System.out.println("The class of the ip address is " +  classofip);
                
    }
   
    
}