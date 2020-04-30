public class SeeClientData {

    DiscountService service = new DiscountService();

    void dataClient(Client client, double price){
        service.DiscountCheckClient(client,price);
        System.out.println("Witaj "+client.getFirsName()+" "+client.getLastname());
        System.out.println("Kwota przed rabatem: "+ price);
        System.out.println("Kwota po rabacie: "+ service.DiscountCheckClient(client,price));
    }
}
