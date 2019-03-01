package Sklep;

public class Sout {
    void printInfo (Client client, DiscountService price){
        System.out.println(client.getFirstName() + " " + client.getSecondName());
        System.out.println("Kwota przed rabatem " + price.getPrice());
        if (price.getPrice() != price.calculateDiscountPrice(client,price.getPrice())) {
            System.out.println("Kwota do zapłaty (po rabacie) " + price.calculateDiscountPrice(client,price.getPrice()));
        }
    }
}
