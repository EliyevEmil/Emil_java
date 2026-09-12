package lesson115;

class Clothing extends Product {
    @Override
    double getDiscountedPrice() {
        return price * 0.80;
    }
}