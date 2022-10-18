package HomeWorkOne;

public class CustomerManager {
    private Customer customer;
    private Person person;
    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void save(){
        System.out.println("Müşteri kaydedildi: " + person.getFirstName() );
    }

    public void delete(){
        System.out.println("Müşteri silindi: " + person.getFirstName());
    }
}
