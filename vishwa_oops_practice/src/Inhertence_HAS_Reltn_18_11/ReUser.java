package Inhertence_HAS_Reltn_18_11;
// re-usability / inheritance

//more than one class can access and we can create  multiple object in this 
//is nothing but composition/ strong association

class Logic {
	int operationAddition(int a, int b) {
		int r = a + b;
		return r;
	}
}

class Print {
	void print(int p) {
		System.out.println(p);
	}
}

public class ReUser {

	public static void main(String[] args) {
		Logic log = new Logic();
		int i = log.operationAddition(12, 20);
		Print p = new Print();
		p.print(i);

	}

}
