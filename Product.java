import java.util.Comparator;
import java.lang.*;

public class Product<P,S>{
	private P id;
	private P name;
	S supplier;

	public P getId() {
		return id;
	}

	public void setId(P id) {
		this.id = id;
	}

	public P getName() {
		return name;
	}

	public void setName(P name) {
		this.name = name;
	}

	public S getSupplier() {
		return supplier;
	}

	public void setSupplier(S supplier) {
		this.supplier = supplier;
	}


	public Product(P id, P name, S supplier) {
		this.id = id;
		this.name = name;
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name=" + name +
				", supplier=" + supplier +
				'}';
	}


	public static Comparator<Product> NameComparator = new Comparator<Product>() {
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getName().toString().compareTo(o2.getName().toString());
		}
	};
}