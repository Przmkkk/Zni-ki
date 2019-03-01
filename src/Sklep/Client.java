package Sklep;

public class Client {
    private String firstName;
    private String secondName;
    private boolean premium;

    public Client(String firstName,String secondName, boolean premium) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.premium = premium;
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
