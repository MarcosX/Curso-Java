public final class Produto {

	private String nome;
	private TipoProduto tipo;
	private double imposto;
	private int codigo;

	public Produto(String nome, TipoProduto tipo, double imposto, int codigo) {
		this.nome = nome;
		this.tipo = tipo;
		this.imposto = imposto;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getImposto() {
		return imposto;
	}

	public TipoProduto getTipo() {
		return tipo;
	}

	public int getCodigo() {
		return codigo;
	}

}
