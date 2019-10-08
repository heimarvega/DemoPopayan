package co.com.everis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YatzyTest {

	@Test
	public void some_method_test() {
		//Arrange 
		int d1=1,d2=2,d3=1,d4=5,d5=6;
		int resultado= 2;
		
		//Act
		 int resulEsperado = Yatzy.ones(d1, d2, d3, d4, d5);
		//Assert
		Assert.assertEquals(resulEsperado, resultado);
	}
	

}
