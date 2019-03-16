import java.lang.*;

public class Customer<I,E,P,K> implements Cloneable{
	private I id;
	private P Phone;
	private E email;
	private K address;

	public I getId() {
		return id;
	}

	public void setId(I id) {
		this.id = id;
	}

	public P getPhone() {
		return Phone;
	}

	public void setPhone(P phone) {
		Phone = phone;
	}

	public E getEmail() {
		return email;
	}

	public void setEmail(E email) {
		this.email = email;
	}

	public K getAddress() {
		return address;
	}

	public void setAddress(K address) {
		this.address = address;
	}


	public Customer(I id, P phone, E email, K address) {
		this.id = id;
		Phone = phone;
		this.email = email;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException{
		return (Customer)super.clone();
	}

}
