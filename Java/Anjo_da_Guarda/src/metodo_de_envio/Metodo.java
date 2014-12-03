package metodo_de_envio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Metodo {
	protected Map<String, String> mapCausaConsequencia = new HashMap<String, String>();
	protected List<Integer> imeis;
protected List<Integer> celulares;

public abstract void actionByString(String inputLine);

}
