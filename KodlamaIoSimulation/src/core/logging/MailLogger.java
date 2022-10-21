package core.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veri Mail olarak loglandı : " + data);

    }
}
