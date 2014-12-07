package metodo_de_envio;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class Metodo {
	public static Map<String, String> mapCausaConsequencia = new HashMap<String, String>();
	

	protected List<Integer> imeis;
	protected List<Integer> celulares;
	protected DateTimeFormatter formatador = DateTimeFormatter
			.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(
					new Locale("pt", "br"));

	public abstract void actionByString(String inputLine);
	

}
