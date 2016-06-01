package udfs;

//import java.util.Scanner;

public class XXXXtoXxxx {
	
	/* 
	  Method ChangeXXXXtoXxxx formats any string to a proper noun (Xxxx)
	  First letter 'X' will be substringed and converted to uppercase,
	  Rest of the string after the first letter 'xxx' will be converted to lowercase.
	  
	 */
	public static String toProper(String StringtoFormat){
		
		//Scanner scr = new Scanner(System.in);
		
		String X;
		String xxx;
		//System.out.println("Type a string to format: ");
		//String StringtoFormat = scr.next();
		
		X = StringtoFormat.substring(0, 1);
		xxx = StringtoFormat.substring(1);
		X = X.toUpperCase();
		xxx = xxx.toLowerCase();
		
		String formattedString = X + xxx;
		//scr.close();
		return formattedString;
	}
}
