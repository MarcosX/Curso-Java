import java.util.Calendar;
import java.util.List;


public class FabricaDeCandle {

	public Candle constroiCandle(
			List<Venda> vendas, Calendar data) {
		double abertura = vendas.get(0).getValor();
		double fechamento = 
				vendas.get(vendas.size() - 1)
				.getValor();
		
		double maximo = vendas.get(0).getValor();
		double minimo = vendas.get(0).getValor();
		
		for (Venda venda : vendas) {
			if(maximo < venda.getValor())
				maximo = venda.getValor();
			if(minimo > venda.getValor())
				minimo = venda.getValor();
		}
		
		return new Candle(abertura, 
				fechamento, 
				minimo, 
				maximo, data);
	}

}






