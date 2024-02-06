package stringClass;

public class StringClassI {

	public static void main(String[] args) {
		
		char [] arr = {'H','e','l','l','o','.'};
		String str = new String (arr);
		System.out.println(str);
		
		String s = "Sumit";
		s.concat(" Tendulkar");
		System.out.println(s);
		
		String s1 = "Sumit";
		s1=s1.concat(" Tendulkar");
		System.out.println(s1);
	}

}
