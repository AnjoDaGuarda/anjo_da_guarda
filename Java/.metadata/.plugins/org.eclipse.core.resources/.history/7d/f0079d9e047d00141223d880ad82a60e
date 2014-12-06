package metodo_de_envio;

import AnjoDaGuarda.SendTextMessage;

public class TransferenciaSMS extends Metodo {

	public void actionByString(String inputLine) {
		for (int i = 0; i < celulares.size(); i++) {
			SendTextMessage messenger = new SendTextMessage(celulares.get(i)
					.toString(), mapCausaConsequencia.get(inputLine));
			messenger.send();
		}
	}
}
