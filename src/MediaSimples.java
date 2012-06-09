
public class MediaSimples
			implements Media {
	private Media indicador;
	
	public MediaSimples(Media indicador) {
		this.indicador = indicador;
	}

	public double calcula(
			SerieTemporal serie,
			int intervalo) {
		double media = 0;
		int tamanhoLista = 
				serie.getCandles()
				.size() - 1;
		for(int i = tamanhoLista;
				i > tamanhoLista - intervalo;
				i--){
			media += indicador.
					calcula(serie, i);
		}
		return media/intervalo;
	}

}







