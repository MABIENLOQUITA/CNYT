import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void sumaTest() {
		Complex a = new Complex(5,-1);
	    Complex b = new Complex(4,-3);
	    Complex r = Complex.suma(a,b);
	    assertEquals(r.getReal(),9.0);
	    assertEquals(r.getReal(),-4.0);
	}
	@Test
	void productoTest() {
		Complex a = new Complex(5,-1);
	    Complex b = new Complex(4,-3);
	    Complex r = Complex.producto(a,b);
	    assertEquals(r.getReal(),17.0);
	    assertEquals(r.getReal(),23.0);
	}

	@Test
	void productoScalarTest() {
		Complex[][] a = {{new Complex(5,-1),new Complex(5,-1)},{new Complex(5,-1),new Complex(5,-1)}};
	    Complex c1 = new Complex(4,-3);
	    Complex[][] r = Complex.productoScalar(c1,a);
	    assertEquals(r[0][0].getReal(),17.0);
	    assertEquals(r[0][0].getReal(),23.0);
	}
	@Test
	void traspuestaCojungadoTest() {
		Complex[][] a = {{new Complex(5,-1),new Complex(1,0)},{new Complex(0,1),new Complex(5,-1)}};
		Complex[][] b = {{new Complex(5,1),new Complex(0,-1)},{new Complex(1,0),new Complex(5,1)}};
		Complex[][] r = Complex.conjugadoM(Complex.traspuesta(a));
	    assertEquals(r,b);
	}


}
