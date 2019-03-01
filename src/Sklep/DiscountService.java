package Sklep;

public class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        if (client.isPremium()) {
            return calculatePremiumDiscount(setPriceDiscount(price));
        } else {
            return calculateStandardDiscount(setPriceDiscount(price));
        }
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(priceDiscount, 0.15);
        } else {
            return applyDiscount(priceDiscount, 0.5);
        }
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(priceDiscount, 0.10);
        } else {
            return priceDiscount;
        }
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }


    private String productName;
    private double price;
    private double priceDiscount;

    public DiscountService(){}

    public DiscountService(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public double setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
        return priceDiscount;
    }


}


