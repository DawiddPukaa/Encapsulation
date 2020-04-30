public class Client {
    private String firsName;
    private String Lastname;
    private boolean premium;

    public Client(String firsName, String lastname, boolean premium) {
        this.firsName = firsName;
        Lastname = lastname;
        this.premium = premium;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
