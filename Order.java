import java.util.Comparator;

public class Order <O,D,I,K,S> implements Comparable<Order>
{
private O number;
private D ordered;
private D shipped;
private I total;
K ship_to;
S status;

public Order(O number, D ordered, D shipped,  I total, K ship_to, S status) {
    this.number = number;
    this.ordered = ordered;
    this.shipped = shipped;
    this.total = total;
    this.ship_to = ship_to;
    this.status = status;
}

    public O getNumber() {
        return number;
    }

    public void setNumber(O number) {
        this.number = number;

    }

    public D getOrdered() {
        return ordered;
    }

    public void setOrdered(D ordered) {
        this.ordered = ordered;
    }

    public D getShipped() {
        return shipped;
    }

    public void setShipped(D shipped) {
        this.shipped = shipped;
    }

    public I getTotal() {
        return total;
    }

    public void setTotal(I total) {
        this.total = total;
    }

    public K getShip_to() {
        return ship_to;
    }

    public void setShip_to(K ship_to) {
        this.ship_to = ship_to;
    }

    public S getStatus() {
        return status;
    }

    public void setStatus(S status) {
        this.status = status;
    }

    @Override
    public int compareTo(Order o) {
        String temp1 = this.toString();
        String temp2 = o.toString();
        return temp1.compareTo(temp2);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", ordered=" + ordered +
                ", shipped=" + shipped +
                ", total=" + total +
                ", ship_to=" + ship_to +
                ", status=" + status +
                '}';
    }
}
