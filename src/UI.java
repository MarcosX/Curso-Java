import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;


public class UI {
	private JFrame frame;
	private JPanel panel;
	private JTable table;
	
	public static void main(String[] args) {
		new UI().montaJanela();
	}
	
	public void montaJanela(){
		montaFrame();
		montaPanel();
		montaTable();
		botaoCarregar();
		exibirJanela();
	}
	
	private void montaFrame(){
		frame = new JFrame(
				"Nossa Aplicação");
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
	}
	
	private void montaPanel(){
		panel = new JPanel();
		frame.add(panel);
	}
	
	private void exibirJanela(){
		frame.pack();
		frame.setSize(540, 540);
		frame.setVisible(true);
	}
	
	private void botaoCarregar(){
		JButton botao = 
			new JButton("Carregar XML");
		botao.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(
							ActionEvent e) {
						List<Candle> candles =
							new EscolheXML().escolher();
						table.setModel(
							new CandleTableModel(candles));
					}
				});
		panel.add(botao);
	}
	
	private void montaTable(){
		table = new JTable();
		table.setBorder(
				new LineBorder(Color.black));
		table.setGridColor(Color.black);
		table.setShowGrid(true);
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().setBorder(null);
		scroll.getViewport().add(table);
		scroll.getViewport()
				.setSize(450, 450);
		
		panel.add(scroll);
	}
}









