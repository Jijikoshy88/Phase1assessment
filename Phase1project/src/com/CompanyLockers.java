package com;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
public class CompanyLockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		options();
	}
	public static void options() {
   	 int choice;
   	 int subchoice;
  
   	do
	 {
   Scanner keyboard = new Scanner(System.in);
   Scanner sub = new Scanner(System.in);
   System.out.println("Choose an option from the list:");
   System.out.println("1. Retrieving the file names in an ascending order");
   System.out.println("2. Business-level operations");
   System.out.println("3. Exit from Main option");
   System.out.println("Enter your option:");
   choice = keyboard.nextInt();
   if (choice==1)
   {
	   String num[] ={"add.txt","welcome.txt","sort.txt"};
	   System.out.println("***Before sort***");
	   for(String n:num)
	   {
	   System.out.println(n+" ");
	   }
	  Arrays.sort(num);
	  
	  System.out.println("***After sort***");
	  for(String n:num)
	   {
	   System.out.println(n+"");
	   }
   }
   
   else if(choice==3)
   {
	   return;
   }
  
   else if (choice == 2) {
	   System.out.println("1.Create file");
	   System.out.println("2.Delete file");
	   System.out.println("3.Search file");
	   System.out.println("4.Exit from business level operations");
	   System.out.println("Enter your option:");
	   subchoice = sub.nextInt();
	   if(subchoice==1) {
	   
   	try {
  	     File file = new File("Newfile.txt");
  	                        boolean fvar = file.createNewFile();
  	                                 
  	     if (fvar){
  	          System.out.println("File has been created successfully");
  	     }
  	     else{
  	          System.out.println("File already present at the specified location");
  	     }
      	} catch (IOException e) {
      		System.out.println("Exception Occurred:");
  	        e.printStackTrace();
  	  }
   	           	
   } else if (subchoice == 2) {
       
   	File myObj = new File("Newfile.txt"); 
       if (myObj.delete()) { 
         System.out.println("Deleted the file: " + myObj.getName());
       } else {
         System.out.println("Failed to delete the file.");
       } 
   	
   }
   else if (subchoice==3) {
	   String[] pathnames;

     
       File f = new File("C:\\Users\\Jiji koshy\\Desktop\\java practice time\\Phase1\\Phase1project");

       pathnames = f.list();
        
      
       for (String pathname : pathnames) {
          
           System.out.println(pathname);
	   
   }
   }
   else if (subchoice == 4) {
       
	   	options();
	   	
	   }
   else if (subchoice > 3 || subchoice < 1) {
       System.out.println("Try again.");
       choice = -1;
       options();
   }
   }
   System.out.println("Do You Want To Continue(Y/N)");
   subchoice = sub.next().charAt(0);
   } while(subchoice == 'Y'|| subchoice == 'y');
	 
   	options();
	
	 }
}
