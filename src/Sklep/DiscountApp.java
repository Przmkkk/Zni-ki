package Sklep;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", false);
        DiscountService tv = new DiscountService("TV", 1100);

        Sout info = new Sout();
        info.printInfo(client1, tv);
    }
}
