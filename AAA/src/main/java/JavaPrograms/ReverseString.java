package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automation";
		String str1= "Geeks for Geeks";
		
		StringBuilder reversed = new StringBuilder(str).reverse();
		
		System.out.println("reverse string " +reversed);
		
		StringBuilder reversedString= new StringBuilder();
		
		reversedString.append(str1);
		
		reversedString.reverse();
		
		System.out.println(reversedString);

		
		
	}

}
