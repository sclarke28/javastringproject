
public class javastringclassproject {

	public static void main(String[] args) {
		String s1 = new String("Group 6.");
		System.out.println(s1);
		
		String s2 = new String();
		
		s2 = s1.replaceAll("(.*)Group", "Tech 6.");
		
		System.out.println(s2);

	}

}
