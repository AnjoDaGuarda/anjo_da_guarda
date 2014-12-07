package metodo_de_envio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import AnjoDaGuarda.SendTextMessage;

public class TransferenciaSMS extends Metodo {
	
	public static List<String> celulares = new ArrayList<String>();

	public void actionByString(String inputLine) {
		String data = LocalDateTime.now().format(formatador);
		for (int i = 0; i < celulares.size(); i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			SendTextMessage messenger = new SendTextMessage(celulares.get(i).toString(), Metodo.mapCausaConsequencia.get(inputLine) + " em "+ data+"\n ");
			
			if(Metodo.mapCausaConsequencia.get(inputLine)!=null){
			messenger.send();
			}
		}
		try {
			Thread.sleep(180000);//Intervalo entre envios - 3 min para apresentação
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
