package HomeWorkOne;

import java.security.AlgorithmConstraints;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();


        Person person = new Person();
        person.setNationalIdentity("1111111111111111");
        person.setFirstName("Ali");


        Customer customer = new Customer();
        customer.setId(1583);



        Company company = new Company();
        company.setTaxNumber("456412896542");



        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();


    }
}