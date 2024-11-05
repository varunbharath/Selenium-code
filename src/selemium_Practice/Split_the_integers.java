package selemium_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_the_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S="test123@gmail.com";
String A="//d+";
Pattern B=Pattern.compile(A);
Matcher c=B.matcher(S);
while(c.find()) {
	
	String n=c.group();
	System.out.println(n);
	
	
}
//System.out.println(c);


	}

}
