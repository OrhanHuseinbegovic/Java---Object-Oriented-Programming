/* package Interfaces;

import java.sql.SQLOutput;

@FunctionalInterface
public interface Mailer {
    public void sendEmail(String recipient, String subject, String body);
}


class MailGrid implements Mailer{
    @Override
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Email hs been sent from mailgrid");
    }
}

class Mailgun implements Mailer{
    @Override
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Email hs been sent from mailgun");
    }
}

class Main{
    public static void main(String[] args) {
        MailGrid m = new MailGrid();
        m.sendEmail("becir, "kasnis", "45 uabrsava cas"");
        // send from mailgrid

        Mailer n = new Mailgun();
        n.sendEmail(); //mailgun sent
    }

}

 */