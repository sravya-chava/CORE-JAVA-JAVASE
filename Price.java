public class Price<P> {
P price;

    public Price() {

    }

    public P getPrice() {
        return price;
    }

    public Price(P price) {
        this.price = price;
    }

    public void setPrice(P price) {
        this.price = price;

    }
}
