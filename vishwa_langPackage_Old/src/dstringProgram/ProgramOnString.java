package dstringProgram;

public class ProgramOnString {

	public static void main(String[] args) {
//		int a;
		int a = 10; // objct banala
		a = 20;
		System.out.println(a);
		

		String str = "ab";
		str = "bb";
		System.out.println(str);

		String str1 = "hello";
		str1.concat(" hi");
		System.out.println(str1);
		System.out.println(str1.concat(" hi"));
		
		str1 = str1.concat(" hiii");
		System.out.println(str1);
		
		str1 ="abs";
		System.out.println(str1);

		System.out.println("-----------------------");
		
		String s1 = new String ("spring");
		s1.concat(" fall");
		String s2= s1.concat(" summer");
		
		System.out.println(s2);
		
// pakg means collection of classes , keyword is an extra featurs 
// te compiler la samjtat so ani compiler te keyword la bytecode made covert
//karto ani to bytecode jvm  la smjto
		
		
		
		
		
	}

}
