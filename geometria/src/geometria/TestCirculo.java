package geometria;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import geometria.main.Circulo_ASG;

class TestCirculo {

	@Test
	public void test7() {
		Circulo_ASG c1 = new Circulo_ASG(7,"circulo");
		assertEquals((int)c1.area(), 153,0);
	}
	
	@Test
	public void testnegativo3() {
		Circulo_ASG c1 = new Circulo_ASG(-3,"circulo");
		assertEquals((int)c1.area(), 28,0);
	}

	@Test
	public void test0() {
		Circulo_ASG c1 = new Circulo_ASG(0,"circulo");
		assertEquals(c1.area(), 0,0);
	}

}
