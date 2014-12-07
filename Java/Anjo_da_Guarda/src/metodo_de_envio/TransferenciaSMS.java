package metodo_de_envio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import AnjoDaGuarda.SendTextMessage;

public class TransferenciaSMS extends Metodo {
	
	public static List<String> celulares = new ArrayList<String>();

	public void actionByString(String inputLine) {
		String data = LocalDateTime.now().format(formatador);
		//for (int i = 0; i < celulares.size(); i++) {
			//SendTextMessage messenger = new SendTextMessage(celulares.get(i)
			//		.toString(), mapCausaConsequencia.get(inputLine) + " em "
			//		+ data);
			SendTextMessage messenger = new SendTextMessage("5521985854673", "Testando sensor arduinos em "+data);
			messenger.send();

			
		//}
	}
}
