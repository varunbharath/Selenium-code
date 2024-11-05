package selemium_Practice;

public class Find_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "accenture";
	
		for(int i=0;i<a.length();i++) {
		 char ch=a.charAt(i);
		switch (ch){
			case 'a':
			case 'b':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch);
		}
			
		}

	}

}
