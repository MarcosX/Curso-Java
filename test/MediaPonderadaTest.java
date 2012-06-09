import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class MediaPonderadaTest {

	@Test
	public void testeDeveCalcularMEdia() {
		List<Candle> candles = 
				new ArrayList<Candle>();
		candles.add(
				new Candle()
					.setAbertura(350.0)
					.setFechamento(200.0)
					.setMinimo(50.0)
					.setMaximo(750.0));
		candles.add(
				new Candle()
					.setAbertura(150.0)
					.setFechamento(300.0)
					.setMinimo(100.0)
					.setMaximo(450.0));
		candles.add(
				new Candle()
					.setAbertura(150.0)
					.setFechamento(200.0)
					.setMinimo(50.0)
					.setMaximo(250.0));
		SerieTemporal serie =
				new SerieTemporal(candles);
		MediaPonderada media = 
				new MediaPonderada(
						new IndicadorAbertura());
		assertEquals( 150.0, 
				media.calcula(serie, 2),0);
	}

}







