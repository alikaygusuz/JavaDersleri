package HomeWorkTwo.interfaces;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
