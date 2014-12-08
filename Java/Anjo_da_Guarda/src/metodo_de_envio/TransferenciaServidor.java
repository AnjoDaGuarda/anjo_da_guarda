package metodo_de_envio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TransferenciaServidor extends Metodo {
	private static CloseableHttpClient httpclient = HttpClients.createDefault();
	private final static String pathUrl = "http://anjodaguarda.bytearanha.com.br/api.php?op=e";
	private static HttpPost post = new HttpPost(pathUrl);
	private static List<NameValuePair> nameValuePairs;
	private static CloseableHttpResponse response;
	private static UrlEncodedFormEntity entity;

	public void enviar(String imei, String comando) {
		try {
			nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("imei", imei));
			nameValuePairs.add(new BasicNameValuePair("senha", "titorarara"));
			nameValuePairs.add(new BasicNameValuePair("comando", comando));
			nameValuePairs.add(new BasicNameValuePair("data", LocalDateTime
					.now().format(formatador)));

			entity = new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8);
			post.setEntity(entity);
			response = httpclient.execute(post);
			HttpEntity entity2 = response.getEntity();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					entity2.getContent(), "UTF-8"));
System.out.println(br.readLine());
			if (entity2 != null) {
				long len = entity2.getContentLength();
				if (len != -1 && len < 2048) {
					System.out.println(EntityUtils.toString(entity2));
				} else {
					// Stream content out
				}
			}

		} catch (UnsupportedEncodingException e) {
			System.out.println("erro1");
		} catch (ClientProtocolException e) {
			System.out.println("erro2");
		} catch (IOException e) {
			System.out.println("erro3");
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} finally {
			System.out.println("fechando conex�o");
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void actionByString(String inputLine) {
		for (int i = 0; i < imeis.size(); i++) {
			enviar(imeis.get(i).toString(), mapCausaConsequencia.get(inputLine));
		}
	}

}