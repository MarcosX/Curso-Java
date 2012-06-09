import java.util.Calendar;

import static org.junit.Assert.*;

import org.junit.Test;


public class VendasTest {

	@Test
	public void testaValorDaVenda() {
		Calendar data = Calendar.getInstance();
		Venda v = new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(),
				1999.99, data);
		assertEquals(1999.99, 
				v.getValor(), 
				0);
	}
	
	@Test
	public void testeAlteraGetData(){
		Calendar data = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		Venda v = new Venda(
				FabricaDeNotebooks
					.getInstancia()
					.criaProduto(),
				1999.99, data);
		data.add(Calendar.DAY_OF_MONTH, 1);
		assertEquals(data2.
				getTime(), 
				v.getData().getTime());
	}
	
}



