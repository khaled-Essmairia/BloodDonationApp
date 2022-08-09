package com.example.bda.Email;

import android.content.Context;
import android.os.AsyncTask;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class JavaMailApi extends AsyncTask<Void,Void,Void> {

    private Context context;
    private String mail,subject,message;
    private Session session;

    public JavaMailApi(Context context, String mail, String subject, String message) {
        this.context = context;
        this.mail = mail;
        this.subject = subject;
        this.message = message;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.socketfactory.port","465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.port","true");
        properties.put("mail.smtp.port","465");
        
        session = Session.getDefaultInstance(properties,new javax.mail.Authenticator()){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(Util.EMAIL,Util.PASSWORD);
            }
        });

        return null;
    }
}
