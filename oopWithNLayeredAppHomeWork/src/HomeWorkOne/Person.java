package HomeWorkOne;

public class Person extends Customer {
    public String NationalIdentity;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }
}
