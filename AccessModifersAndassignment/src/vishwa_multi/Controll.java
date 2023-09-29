package vishwa_multi;

public class Controll {
	
public static void main(String[] args) {

System.out.println("i am a main method");

//Thread thread = new Thread();
//thread.start();

//Runnable r = new B();
//instead of child object even we can pass parenmt ref variable
Thread thread1 = new Thread(new B());
thread1.start();
}
}
