package function;
interface ABC{
	void show();
}
public class Demo {
public static void main(String[] args) {
	ABC v = ()->{
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
	};
	v.show();      // without method call
}
}
	
