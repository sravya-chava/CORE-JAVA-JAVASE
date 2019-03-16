import java.util.Date;
public class CashPayment extends Payment {
private String id;
private Date paid;
private String total;
private String details;
    public CashPayment(String id, Date paid, String total, String details) {
        super(id, paid, total, details);
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }
     public String getId() {
        return id;
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
        return "CashPayment{" +
                "id='" + id + '\'' +
                ", paid=" + paid +
                ", total='" + total + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
