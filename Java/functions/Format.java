package udfs;

public class Format {
	/* 
	  Method "phoneNumber" formats a phone number to add dashes and parenthesis.  
	 */
	public static String phoneNumber(String phoneNumber){
		if(phoneNumber.length() == 10){
			String firstSet = phoneNumber.substring(0,3);
			String midSet = phoneNumber.substring(3, 6);
			String lastSet = phoneNumber.substring(6);

			String formattedNumber = "(" + firstSet + ")-" + midSet + "-" + lastSet;

			return formattedNumber;
		}
		else if(phoneNumber.length() == 11){
			String firstSet = phoneNumber.substring(1,4);
			String midSet = phoneNumber.substring(4, 7);
			String lastSet = phoneNumber.substring(7);

			String formattedNumber = phoneNumber.charAt(0) + "-(" + firstSet + ")-" + midSet + "-" + lastSet;

			return formattedNumber;
		}
		return "ERROR, Invalid phone number length";
	}

	/* 
	  Method "toProperNoun" formats any string to a proper noun (Xxxx)
	  First letter 'X' will be substringed and converted to uppercase,
	  Rest of the string after the first letter 'xxx' will be converted to lowercase.
	  
	 */
	public static String toProperNoun(String StringtoFormat){
		String X;
		String xxx;

		X = StringtoFormat.substring(0, 1);
		xxx = StringtoFormat.substring(1);
		X = X.toUpperCase();
		xxx = xxx.toLowerCase();
		String formattedString = X + xxx;

		return formattedString;
	}
}
