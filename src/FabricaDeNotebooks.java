public class FabricaDeNotebooks implements FabricaDeProdutos {

	private static FabricaDeNotebooks fabrica
				= new FabricaDeNotebooks();
	
	private FabricaDeNotebooks(){
		
	}
	
	@Override
	public Produto criaProduto() {
		return new Produto("Notebook", TipoProduto.Eletronico, 0.15, 1);
	}
	
	public static FabricaDeProdutos getInstancia(){
		if(fabrica == null)
			fabrica = new FabricaDeNotebooks();
		return fabrica;
	}

}
