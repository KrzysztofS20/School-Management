package Entity;

public class Teacher {
    private String firstName;
    private String secondName;
    private int personalIdentity;
    private int phoneNumber;
    private String email;
    private Double salary;

    public Teacher(String firstName, String secondName, int personalIdentity, int phoneNumber, String email, Double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personalIdentity = personalIdentity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPersonalIdentity() {
        return personalIdentity;
    }

    public void setPersonalIdentity(int personalIdentity) {
        this.personalIdentity = personalIdentity;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
