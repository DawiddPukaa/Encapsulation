public class DiscountService {


        double DiscountCheckClient(Client client, double price){

            double discountPrice = price;
            if(client.isPremium()) {
                return ClientisPremium(price);
            }else{
                return ClientisNotPremium(price);
            }
        }

      private   double ClientisPremium(double price){
            if(price > 1000) {
                price *= 0.85;
            }else{
                price*=0.95;
            }
            return price;
        }

       private double ClientisNotPremium(double price){
            if(price>1000){
              price *= 0.9;
            }
            return price;

        }


}
