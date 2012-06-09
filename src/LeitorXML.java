import java.io.Reader;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class LeitorXML {

	@SuppressWarnings("unchecked")
	public List<Candle> carrega(
			Reader xml) {
		XStream stream = 
				new XStream(new DomDriver());
		stream.alias("candle", Candle.class);
		return 
		  (List<Candle>) stream.fromXML(xml);
	}

}





