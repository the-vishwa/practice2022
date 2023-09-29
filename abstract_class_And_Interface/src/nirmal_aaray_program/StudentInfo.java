package nirmal_aaray_program;

public class StudentInfo {
	
	Student[] getinfo() {
		Student[] s = new Student[3];

		s[0] = new Student("nirmal","math",96);
		s[1] = new Student("divya","computer",98);
		s[2] = new Student("duggu","java",98);
	
	
		for(int i = 0;i<s.length; i++) {
			System.out.println(s[i].Name);
			System.out.println(s[i].Sub);
			System.out.println(s[i].Marks);
		}
		
		return s;
	 
		
	}
	


}