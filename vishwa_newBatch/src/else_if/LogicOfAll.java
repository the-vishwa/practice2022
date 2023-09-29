package else_if;

public class LogicOfAll {
	Student logic(int age) {
    	   Student ss =null;
	if(age >=2 &&  age <=5) {
		ss = new Student("play",2,5,4000.4);
	}else if (age >=5 &&  age <=10){
		ss = new Student("nursery",5,10,5000.4);
	}else if (age >=10 &&  age <=15){
		ss = new Student("kg",10,15,7000.4);
	}
	return ss;
}
}
