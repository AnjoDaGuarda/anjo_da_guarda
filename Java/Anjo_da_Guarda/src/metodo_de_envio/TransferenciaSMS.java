package metodo_de_envio;

import java.time.LocalDateTime;

import AnjoDaGuarda.SendTextMessage;

public class TransferenciaSMS extends Metodo {

	public void actionByString(String inputLine) {
		String data = LocalDateTime.now().format(formatador);
		for (int i = 0; i < celulares.size(); i++) {
			SendTextMessage messenger = new SendTextMessage(celulares.get(i)
					.toString(), mapCausaConsequencia.get(inputLine) + " em "
					+ data);
			messenger.send();
		}
	}
}
