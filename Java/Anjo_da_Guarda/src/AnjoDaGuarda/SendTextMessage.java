package AnjoDaGuarda;
/*
 * Copyright (c) 2011-2013 Nexmo Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import com.nexmo.messaging.sdk.NexmoSmsClient;
import com.nexmo.messaging.sdk.SmsSubmissionResult;
import com.nexmo.messaging.sdk.messages.TextMessage;

/**
 * SendTextMessage.java<br><br>
 *
 * An example of using the nexmo sms api to submit a simple text message ...<br><br>
 *
 * Created on 5 January 2011, 17:34
 *
 * @author  Paul Cook
 * @version 1.0
 */
public class SendTextMessage {

    public String API_KEY = "c72031e5";
    public String API_SECRET = "f4eb89d9";

    public String SMS_FROM = "12345";
    public String smsTo = "5521985854673";
    public String smsText = "Hello World!";

    public SendTextMessage(String receiver, String text) {

        
    	this.smsTo = receiver;
    	this.smsText = text;
    	

            
    }
    
    public void send(){
    	
    	// Create a client for submitting to Nexmo
    	  NexmoSmsClient client = null;
          try {
              client = new NexmoSmsClient(API_KEY, API_SECRET);
          } catch (Exception e) {
              System.err.println("Failed to instanciate a Nexmo Client");
              e.printStackTrace();
              throw new RuntimeException("Failed to instanciate a Nexmo Client");
          }

          // Create a Text SMS Message request object ...

          TextMessage message = new TextMessage(SMS_FROM, smsTo, smsText);

          // Use the Nexmo client to submit the Text Message ...


    	  SmsSubmissionResult[] results = null;
          try {
              results = client.submitMessage(message);
          } catch (Exception e) {
              System.err.println("Failed to communicate with the Nexmo Client");
              e.printStackTrace();
              throw new RuntimeException("Failed to communicate with the Nexmo Client");
          }

          // Evaluate the results of the submission attempt ...
          System.out.println("... Message submitted in [ " + results.length + " ] parts");
          for (int i=0;i<results.length;i++) {
              System.out.println("--------- part [ " + (i + 1) + " ] ------------");
              System.out.println("Status [ " + results[i].getStatus() + " ] ...");
              if (results[i].getStatus() == SmsSubmissionResult.STATUS_OK)
                  System.out.println("SUCCESS");
              else if (results[i].getTemporaryError())
                  System.out.println("TEMPORARY FAILURE - PLEASE RETRY");
              else
                  System.out.println("SUBMISSION FAILED!");
              System.out.println("Message-Id [ " + results[i].getMessageId() + " ] ...");
              System.out.println("Error-Text [ " + results[i].getErrorText() + " ] ...");

              if (results[i].getMessagePrice() != null)
                  System.out.println("Message-Price [ " + results[i].getMessagePrice() + " ] ...");
              if (results[i].getRemainingBalance() != null)
                  System.out.println("Remaining-Balance [ " + results[i].getRemainingBalance() + " ] ...");
          }
    }

}
