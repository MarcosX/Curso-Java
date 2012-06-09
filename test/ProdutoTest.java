import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void testNomeProduto() {
		Produto p = new Produto("Notebook", TipoProduto.Eletronico, 0.15, 1);
		assertEquals("Notebook", p.getNome());
	}
	
	@Test
	public void testValorImposto(){
		Produto p = new Produto("Notebook", TipoProduto.Eletronico, 0.15, 1);
		assertEquals(0.15, p.getImposto(),0);
	}
	

}
