package function;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = str -> str.length();
		System.out.println(f.apply("vishwajit"));
	}
}
