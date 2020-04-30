public class DiscountAPP {

    public static void main(String[] args) {
        Client client1 = new Client("Januch","Pasieczny",false);
        double price = 1000;
        SeeClientData check = new SeeClientData();
        check.dataClient(client1,price);
//zostało dorobić ify w wyświtlaniu Np. kiedy w wartości fristName jest NULL

    }

}
