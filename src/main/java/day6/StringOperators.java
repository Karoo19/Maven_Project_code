package day6;

public class StringOperators {

	public static void main(String[] args) {
		
		String S="welcome";
		//String S=new String("welcome);
		
		System.out.println(S);
		
		//Length
		System.out.println(S.length());
		
		//Concat()- Joining String
		
		String S1="Welcome";
		String S2="to jave";
		String S3="automation";
		
		System.out.println(S1 +S2);
		System.out.println(S1.concat(S2));
		System.out.println(S1+" "+S2);
		
		System.out.println(S1+S2+S3);
		System.out.println(S1.concat(S2).concat(S3));
		
		//CharAt() return single char based on index we passed
		//index count start 0
		
		S="welcome";
		
		System.out.println(S.charAt(0));
		System.out.println(S.charAt(3));
		
		//Contains - return boolean
		
		System.out.println(S.contains("wel"));   //true
		System.out.println(S.contains("com"));   //true
		System.out.println(S.contains("Wel"));    //false
		
		//equals() - equalsIgnoreCase()  -compare 2 Strings
		
		S1="welcome";
		S2="WELCOME";
		
		System.out.println(S1.equals(S2));           //false
		System.out.println(S1.equalsIgnoreCase(S2)); //true
		
		//replace()- replace single/multiple characteres in a string
		
		S="welcome to selenium automation testing selenium training";
		
		System.out.println(S.replace('e','x'));       //wxlcomx to sxlxnium automation txsting sxlxnium training
		System.out.println(S.replace("selenium","java"));
		
		
		//Substring() -    extract substring from main string
		S="welcome";
		
		System.out.println(S.substring(2,5));    //lco
		System.out.println(S.substring(0,6));    //welcom
		
		
	}

}
