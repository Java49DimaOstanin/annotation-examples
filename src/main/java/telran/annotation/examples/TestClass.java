package telran.annotation.examples;

import telran.test.annotation.BeforeEach;
import telran.test.annotation.Test;

public class TestClass {
private void f1(int b) {
	System.out.println("test f1 passed " + b);
}
    void f1() {
	System.out.println("test f1 faled ");
}
@Test
    void test1() {
	f1(10);
}
@Test
	void test() {
	f1();
	}
@BeforeEach
void setup() {
	System.out.println("Set Up ");
}
}
