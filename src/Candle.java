import java.util.Calendar;

public class Candle {
	private double abertura = 100.0, fechamento = 500.0, minimo = 60.0,
			maximo = 550.0;
	private Calendar data;

	public Candle(double abertura, double fechamento, double minimo,
			double maximo, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.data = data;
	}

	public Candle() {
	}

	@Coluna(posicao=4,
			formato="R$ %,#.2f",
			nome="Abertura")
	public double getAbertura() {
		return abertura;
	}
	
	@Coluna(posicao=1,
			formato="R$ %,#.2f",
			nome="Fechamento")
	public double getFechamento() {
		return fechamento;
	}

	@Coluna(posicao=3,
			formato="R$ %,#.2f",
			nome="Mínimo")
	public double getMinimo() {
		return minimo;
	}

	@Coluna(posicao=2,
			formato="R$ %,#.2f",
			nome="Máximo")
	public double getMaximo() {
		return maximo;
	}

	@Coluna(posicao=0,
			formato="%1$Td/%1$Tm/%1$TY",
			nome="Data")
	public Calendar getData() {
		return data;
	}

	public boolean isAlta() {
		return fechamento > abertura;
	}

	public Candle setAbertura(
			double abertura) {
		this.abertura = abertura;
		return this;
	}

	public Candle setFechamento(
			double fechamento) {
		this.fechamento = fechamento;
		return this;
	}

	public Candle setMinimo(
			double minimo) {
		this.minimo = minimo;
		return this;
	}

	public Candle setMaximo(
			double maximo) {
		this.maximo = maximo;
		return this;
	}

	public Candle setData(Calendar data) {
		this.data = data;
		return this;
	}

}







