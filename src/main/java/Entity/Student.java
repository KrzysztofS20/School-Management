package Entity;

public class Student {
    private String firstName;
    private String secondName;
    private int personalIdentity;
    private int yearOfStudy;
    private int phoneNumber;
    private String email;
    private Double amountToPay;
    private Double alreadyPaid;

    public Student(String firstName, String secondName, int personalIdentity, int yearOfStudy, int phoneNumber, String email, Double amountToPay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personalIdentity = personalIdentity;
        this.yearOfStudy = yearOfStudy;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.amountToPay = amountToPay;
        this.alreadyPaid = 0.00;
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

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
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

    public Double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public Double getAlreadyPaid() {
        return alreadyPaid;
    }

    public void setAlreadyPaid(Double alreadyPaid) {
        this.alreadyPaid = alreadyPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", personalIdentity=" + personalIdentity +
                ", yearOfStudy=" + yearOfStudy +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", amountToPay=" + amountToPay +
                ", alreadyPaid=" + alreadyPaid +
                '}';
    }
}
