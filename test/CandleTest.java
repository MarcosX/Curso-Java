import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;


public class CandleTest {

	@Test
	public void testDeveCriarCandle() {
		double abertura = 100.0, 
				fechamento = 500.0,
				minimo = 60.0,
				maximo = 550.0;
		Calendar data = Calendar.getInstance();
		Candle c = new Candle(
					abertura, 
					fechamento, 
					minimo, 
					maximo,
					data);
		assertEquals(abertura, c.getAbertura(),0);
		assertEquals(fechamento, c.getFechamento(),0);
		assertEquals(minimo, c.getMinimo(),0);
		assertEquals(maximo, c.getMaximo(),0);
		assertEquals(data.getTime(), 
				c.getData().getTime());
	}
	
	@Test
	public void testDeveCriarCandleAlta(){
		double abertura = 100.0, 
				fechamento = 500.0,
				minimo = 60.0,
				maximo = 550.0;
		Calendar data = Calendar.getInstance();
		Candle c = new Candle(
					abertura, 
					fechamento, 
					minimo, 
					maximo,
					data);
		assertEquals(true, c.isAlta());
	}
	
	@Test
	public void testDeveCriarCandleBaixa(){
		//....
	}
	
	
	@Test
	public void deveCriarCandleComSetters(){
		Candle c = new Candle();
		Calendar data = Calendar.getInstance();
		c.setAbertura(100.0);
		c.setFechamento(200.0);
		c.setMinimo(50.0);
		c.setMaximo(650.0);
		c.setData(data);
		assertEquals(100.0, c.getAbertura(), 0);
		assertEquals(200.0, c.getFechamento(), 0);
		assertEquals(50.0, c.getMinimo(), 0);
		assertEquals(650.0, c.getMaximo(), 0);
		assertEquals(data.getTime(), 
				c.getData().getTime());
	}

}









