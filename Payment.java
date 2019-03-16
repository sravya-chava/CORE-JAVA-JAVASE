import java.util.Date;

public class Payment {
protected String id;
protected Date paid;
protected String total;
protected String details;

    public Payment() {

    }
    public String getId() {
        return id;
    }

    public Payment(String id, Date paid, String total, String details) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }

    public void setId(String id) {

        this.id = id;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", paid=" + paid +
                ", total='" + total + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

