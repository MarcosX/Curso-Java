import java.lang.reflect.Method;
import java.util.List;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class CandleTableModel extends AbstractTableModel {

	private List<?> candles;
	private Class<?> classe;

	public CandleTableModel(List<?> candles) {
		this.candles = candles;
		classe = candles.get(0).getClass();
	}

	@Override
	public int getColumnCount() {
		int colunas = 0;
		for (Method m : classe.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Coluna.class)) {
				colunas++;
			}

		}

		return colunas;
	}

	@Override
	public int getRowCount() {
		return candles.size();
	}

	@Override
	public Object getValueAt(int i, int j) {
		try {
			Object c = candles.get(i);
			for (Method m : classe.getDeclaredMethods()) {
				Coluna coluna = m.getAnnotation(Coluna.class);
				if (coluna != null && coluna.posicao() == j) {
					return String.format(coluna.formato(), m.invoke(c));
				}
			}
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		for (Method m : classe.getDeclaredMethods()) {
			Coluna coluna = m.getAnnotation(Coluna.class);
			if (coluna != null && coluna.posicao() == column) {
				return coluna.nome();
			}

		}
		return "";
	}

}
