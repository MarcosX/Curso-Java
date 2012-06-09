import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;


public class FabricaDeCandleTest {

	@Test
	public void testeDeveCriarCandle() {
		FabricaDeCandle fabrica = new FabricaDeCandle();
		List<Venda> vendas =
				new ArrayList<Venda>();
		Calendar data = Calendar.getInstance();
		vendas.add(new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(), 
				200.0, data));
		vendas.add(new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(), 
				500.0, data));
		vendas.add(new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(), 
				100.0, data));
		vendas.add(new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(), 
				300.0, data));
		Candle c = fabrica.constroiCandle(
				vendas, data);
		assertEquals(200.0, c.getAbertura(), 0);
		assertEquals(300.0, c.getFechamento(), 0);
		assertEquals(500.0, c.getMaximo(), 0);
		assertEquals(100.0, c.getMinimo(), 0);
	}
	
	@Test(expected=
		IndexOutOfBoundsException.class)
	public void testeCandleListaVazia(){
		FabricaDeCandle fabrica = 
				new FabricaDeCandle();
		List<Venda> vendas =
				new ArrayList<Venda>();
		Calendar data = Calendar.getInstance();
		Candle c = fabrica.constroiCandle(
				vendas, data);
		assertEquals(200.0, c.getAbertura(), 0);
		assertEquals(300.0, c.getFechamento(), 0);
		assertEquals(500.0, c.getMaximo(), 0);
		assertEquals(100.0, c.getMinimo(), 0);
	}

}






