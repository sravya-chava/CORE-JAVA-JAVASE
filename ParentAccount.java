import java.util.Date;

public class ParentAccount{
    private String id;
    private Address billing_address;
    private Boolean isClosed;
    private Date open;
    private Date closed;

    public ParentAccount(String id, Address billing_address , Boolean isClosed, Date open, Date closed) {
        this.id = id;
        this.billing_address = billing_address;
        this.isClosed = isClosed;
        this.open = open;
        this.closed = closed;
    }

    public ParentAccount() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(Address billing_address) {
        this.billing_address = billing_address;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }
    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }
    }
