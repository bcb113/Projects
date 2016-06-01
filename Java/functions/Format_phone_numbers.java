package udfs;

public class Format_phone_numbers {

	public String formatNumber(String phoneNumber){
		
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
	
	public static void main(String[] args) {
		Format_phone_numbers f = new Format_phone_numbers();
		String result = f.formatNumber("4045552069");
		String resultLong = f.formatNumber("14045552069");
		System.out.println("Formatted Number: " + result + "\nFormatted Long-Distance Number: " + resultLong);
	}
}
