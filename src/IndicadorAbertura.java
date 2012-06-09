
public class IndicadorAbertura 
			implements Media {

	@Override
	public double calcula(
			SerieTemporal serie, 
			int i) {
		return serie
				.getCandles()
				.get(i).getAbertura();
	}

}




