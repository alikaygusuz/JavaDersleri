package HomeWorkTwo.abstractClasesDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("veri getirildi : MySQL");
    }
}
