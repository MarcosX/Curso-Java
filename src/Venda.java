import java.util.Calendar;


public final class Venda {
	
	private Produto produto; 
	private double valor;
	private final Calendar data;
	

	public Venda(Produto produto, double valor, Calendar data) {
		this.produto = produto;
		this.valor = valor;
		this.data = (Calendar) data.clone();
	}

	public Produto getProduto() {
		return produto;
	}

	public Calendar getData() {
		return (Calendar) data.clone();
	}

	public double getValor() {
		return valor;
	}

}
