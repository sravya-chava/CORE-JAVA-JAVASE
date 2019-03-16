public class Address<S,Z> {
    private S state;
    private S city;
    private S county;
    private Z zipcode;

    public Address(S state, S city, S county, Z zipcode) {
        this.state = state;
        this.city = city;
        this.county = county;
        this.zipcode = zipcode;
    }

    public S getState() {
        return state;
    }

    public void setState(S state) {
        this.state = state;
    }

    public S getCity() {
        return city;
    }

    public void setCity(S city) {
        this.city = city;
    }

    public S getCounty() {
        return county;
    }

    public void setCounty(S county) {
        this.county = county;
    }

    public Z getZipcode() {
        return zipcode;
    }

    public void setZipcode(Z zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state=" + state +
                ", city=" + city +
                ", county=" + county +
                ", zipcode=" + zipcode +
                '}';
    }
}
