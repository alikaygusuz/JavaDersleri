package oopwithNLayeredApp.core.logging;

public class databaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı: " + data );

    }
}
