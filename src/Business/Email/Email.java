/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author khushbu
 */
public class Email {

    public static boolean sendMail(String from, String password, String message, String to) {
        String host = "smtp.gmail.com";
        Properties prop = System.getProperties();
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.user", from);
        prop.put("mail.smtp.password", password);
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        Session session = Session.getDefaultInstance(prop, null);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(from));
//            InternetAddress[] toAddress = new InternetAddress[to.length];
//            for (int i = 0; i < to.length; i++) {
//                toAddress[i] = new InternetAddress(to[i]);
//            }
//            for (int i = 0; i < to.length; i++) {
                mimeMessage.setRecipients(Message.RecipientType.TO, to);
//            }
            mimeMessage.setSubject("Appointment Schedule");
            mimeMessage.setText(message);
            Transport transport = session.getTransport("smtp");
              transport.connect(host, from, password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
            return true;
        } catch (MessagingException me) {
            me.printStackTrace();
        }
        return false;
    }
}
