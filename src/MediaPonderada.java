
public class MediaPonderada 
		implements Media {
	
	private Media indicador;
	
	public MediaPonderada(Media indicador){
		this.indicador = indicador;
	}

	public double calcula(
			SerieTemporal serie, 
			int intervalo) {
		double media = 0;
		int tamanhoLista = 
				serie.getCandles()
				.size() - 1;
		int peso = intervalo;
		int somatorioPesos = 0;
		for(int i = tamanhoLista;
				i > tamanhoLista - intervalo;
				i--){
			media += indicador
					.calcula(serie, i)
					* peso;
			somatorioPesos += peso;
			peso--;
		}
		return media/somatorioPesos;
	}

}
