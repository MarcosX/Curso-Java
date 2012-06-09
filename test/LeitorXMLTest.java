import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

import org.junit.Test;


public class LeitorXMLTest {

	@Test
	public void testeDeveCriarListaDeXML() {
		LeitorXML leitor = new LeitorXML();
		List<Candle> candles = 
				leitor.carrega(
					new StringReader("<list><candle>"
							+ "<maximo>300.0</maximo>"
							+ "<minimo>50.0</minimo>"
							+ "<abertura>30.0</abertura>"
							+ "<fechamento>400.0</fechamento>"
							+ "<data>"
							+ "<time>1333735559926</time>"
							+ "<timezone>America/Fortaleza</timezone>"
							+ "</data>"
							+ "</candle></list>"));
		assertEquals(1, candles.size());
		assertEquals(300.0, 
				candles.get(0).getMaximo(),0);
	}

}






