package com.anjodaguardateam.anjodaguardaapp;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Entity;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.util.Log;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RF411 on 06/12/2014.
 */
public class CheckServerResponse extends IntentService
{
    private Context context;

    public CheckServerResponse()
    {
        super("CheckServerResponse");
    }

    public void onHandleIntent(Intent workIntent)
    {
        receiveData();
    }

    public void receiveData()
    {
        new Thread(){
            public void run(){
                postHttp();
            }
        }.start();
    }

    public void postHttp()
    {
        context = this;
        String tag_json_obj = "json_obj_req";
        String url = "http://anjodaguarda.bytearanha.com.br/api.php?op=p";

        CloseableHttpClient httpClient = HttpClients.createMinimal();
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response;
        HttpEntity httpEntityReceive;
        BufferedReader br;

        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("email", "1234567890"));
        nameValuePairs.add(new BasicNameValuePair("senha", "titorarara"));

//        nameValuePairs.add(new BasicNameValuePair("comando", "fogo"));
//        nameValuePairs.add(new BasicNameValuePair("data", "2/3/2014 8:50:20"));

        try
        {
            HttpEntity httpEntitySend = new UrlEncodedFormEntity(nameValuePairs);
            httpPost.setEntity(httpEntitySend);

            response = httpClient.execute(httpPost);
            if (response != null)
            {
                httpEntityReceive = response.getEntity();
                br = new BufferedReader(new InputStreamReader(httpEntityReceive.getContent(), "UTF-8"));

                Log.d("br br br", br.readLine() + "");
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(context.TELEPHONY_SERVICE);


                String imei = telephonyManager.getDeviceId();

                Log.d("imei", imei);
                /*
                if (response.getImei().equals(imei))
                {
                    Log.d("JsonObjectResponse", response.getCommand());
                    NotificationManager notificationManager = (NotificationManager)
                            context.getSystemService(Context.NOTIFICATION_SERVICE);

                    NotificationCompat.Builder mBuilder =
                            new NotificationCompat.Builder(context)
                                    .setSmallIcon(R.drawable.ic_launcher)
                                    .setContentTitle("ALERTA!" + response.getDate())
                                    .setContentText(response.getCommand());
                    Notification n = mBuilder.build();

                    notificationManager.notify(R.id.alertService, n);
                }
                */
            }

        }
        catch(ClientProtocolException cpe){}
        catch(IOException ioe){}
    }
}
