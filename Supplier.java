public class Supplier<P> {
    private P supplierName;
    private P supplierPlace;

    public P getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(P supplierName) {
        this.supplierName = supplierName;
    }

    public P getSupplierPlace() {
        return supplierPlace;
    }

    public void setSupplierPlace(P supplierPlace) {
        this.supplierPlace = supplierPlace;
    }

    public Supplier(P supplierName, P supplierPlace) {
        this.supplierName = supplierName;
        this.supplierPlace = supplierPlace;
    }
}
