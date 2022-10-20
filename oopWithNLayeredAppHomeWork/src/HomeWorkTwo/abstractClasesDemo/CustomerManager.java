package HomeWorkTwo.abstractClasesDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
