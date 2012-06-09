import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class EscolheXML {
	public List<Candle> escolher(){
		try {
			JFileChooser chooser =
					new JFileChooser(".");
			chooser.setFileFilter(
					new FileNameExtensionFilter(
							"Arquivos XML", "xml"));
			int codigo = chooser.showOpenDialog(null);
			if(codigo == JFileChooser
					.APPROVE_OPTION){
				
					FileReader reader =
						new FileReader(
							chooser.getSelectedFile());
				
				List<Candle> candles =
						new LeitorXML()
							.carrega(reader);
				return candles;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}







