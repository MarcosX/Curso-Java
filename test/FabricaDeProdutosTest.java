import static org.junit.Assert.*;

import org.junit.Test;


public class FabricaDeProdutosTest {

	@Test
	public void testCriaNotebook() {
		Produto p = FabricaDeNotebooks
				.getInstancia()
				.criaProduto();
		assertEquals("Notebook", p.getNome());
		//...
	}

}
