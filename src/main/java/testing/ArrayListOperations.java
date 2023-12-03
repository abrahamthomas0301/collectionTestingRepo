package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> userlist=new ArrayList();
		while(true) {
		System.out.println("Arraylist operations");
		System.out.println("1. select to enter data");
		System.out.println("2. select to display data");
		System.out.println("3. exit");
		 int userinput;
	       Scanner input = new Scanner(System.in);
	       userinput=input.nextInt();
	       
	       switch(userinput) {
	       case 1:
	    	   System.out.println("enter the data forr list:");
	    	   input.nextLine();
	    	   String inputString=input.nextLine();
	    	   userlist.add(inputString);
	    	   System.out.println(inputString.length());
	    	   break;
	       case 2:
	    	   System.out.println("Entered data");
	    	   userlist.forEach(value->System.out.println(value));
	    	   break;
	    	case 3:
	    	   userlist=null;
	    	   return ;
	        default:
	    	   System.out.println("invalid");
	    	   break;
	       }

	}
	}
}
