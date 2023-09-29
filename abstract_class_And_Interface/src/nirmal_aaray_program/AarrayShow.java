package nirmal_aaray_program;

public class AarrayShow {
	
	Aaray[] getaarayinfo(){
		Aaray[] a = new Aaray[3];
		
		a[0] = new Aaray("nirmal","english",95);
		a[1] = new Aaray("divya","computer",98);
		a[2] = new Aaray("diuu","java",92);
		
		System.out.println(a[0].Name);
		System.out.println(a[0].Subject);
		System.out.println(a[0].Marks);
		
		System.out.println(a[1].Name);
		System.out.println(a[1].Subject);
		System.out.println(a[1].Marks);
		
		System.out.println(a[2].Name);
		System.out.println(a[2].Subject);
		System.out.println(a[2].Marks);
		
		
		
		
		
		
		
		
		return a;
	}

}
