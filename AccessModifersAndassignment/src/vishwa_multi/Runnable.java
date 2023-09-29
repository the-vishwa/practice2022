package vishwa_multi;

 interface  Runnable {
	void run();

}
class B implements Runnable{
	@Override
	public void run() {
	System.out.println("i am a child method");
		
	}
}

	
