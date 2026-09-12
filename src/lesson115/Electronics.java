package lesson115;

class Electronics extends Product {
    @Override
    double getDiscountedPrice() {
        return price * 0.90;
    }
}