package nirmal_aaray_program;

public class Array {
	public static void main(String[] args) {
		
		String StudentName[] = {"nirmal","divya","duggu","ttiboo"};
		String Subject[] = {"math","english","java","computer"};
		int marks[] = {95,96,97,98};
		
		for(int i = 0; i <StudentName.length;i++) {
			System.out.println(StudentName[i]+ " grade" + " " + Subject[i]+ " " +"got"+" " +marks[i]+ " " +"marks");
		}
		
		
	}

}
