package nirmal_practice_of_import;

public class Student1Info {

	public Student1[] getstudents1info() {
		
		Student1[] arr = new Student1[3];
		
		arr[0] = new Student1("nirmal","rajput", 12);
		arr[1] = new Student1("divya","rajput",13);
		arr[2] = new Student1("sejal","borase",14);
	
		return arr;

	}
}
